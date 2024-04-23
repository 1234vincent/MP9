public class BrailleASCII {
    private static String toBraille(String message) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char c = Character.toUpperCase(message.charAt(i));
            String braille = Braille_trees.toBraille(c);
            if (braille.equals("?")) {
                System.err.println("Warning: Unrecognized character '" + c + "' converted to '?' in Braille.");
            }
            result.append(braille);
        }
        return result.toString();
    }

    private static String toASCII(String message) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < message.length(); i += 6) {
            String temp = message.substring(i, Math.min(i + 6, message.length()));
            String ascii = Braille_trees.toASCII(temp);
            if (ascii.equals("?")) {
                System.err.println("Warning: Unrecognized Braille code '" + temp + "' converted to '?' in ASCII.");
            }
            result.append(ascii);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java BrailleASCII <target> <message>");
            System.exit(1);
        }
        String target = args[0];
        String message = args[1];

        switch (target.toLowerCase()) {
            case "braille":
                System.out.print(toBraille(message));
                break;
            case "ascii":
                System.out.print(toASCII(message));
                break;
            case "unicode":
                String result = "";
                String brailleString = toBraille(message);
                for (int i = 0; i < brailleString.length(); i += 6) {
                    String segment = brailleString.substring(i, Math.min(i + 6, brailleString.length()));
                    result += Braille_trees.toUnicode(segment);
                }
                System.out.print(result);
                break;
            default:
                System.out.println("Error: Unsupported conversion target '" + target + "'.");
                System.exit(1);
        }
    }
}
