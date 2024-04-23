public class BrailleASCII {
    private static String toBraille(String message){
        String result = "";
        for (int i = 0; i < message.length(); i++) {
            char c = Character.toUpperCase(message.charAt(i));
            result += Braille_trees.toBraille(c);
        }
        return result;
    }
    private static String toASCII(String message){
        String result = "";
        String temp = "";
        for (int i = 0; i < message.length(); i+=6) {
            temp = message.substring(i, Math.min(i+6, message.length()));
            result += Braille_trees.toASCII(temp);
        }
        return result;
    }
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java BrailleASCII <braille>");
            System.exit(1);
        }
       String target = args[0];
        String message = args[1];
        if(target.equals("braille")){
            System.out.print(toBraille(message));
        }
        else if(target.equals("ascii")){
            System.out.print(toASCII(message));
        }else if(target.equals("unicode")){
            String result = "";
            String temp = toBraille(message);
            for (int i = 0; i < temp.length(); i+=6) {
                result += Braille_trees.toUnicode(temp.substring(i, Math.min(i+6, temp.length())));
            }
            System.out.print(result);
        }else{
            System.out.println("Please enter a valid target.");
            System.exit(1);
        }
    }

}
