import java.util.HashMap;
import java.util.Map;

public class Mapping {
    public static Map<String, String> getBrailleToAsciiMap(int a) {
        Map<String, String> brailleToAscii = new HashMap<>();
        brailleToAscii.put("100000", "A");
        brailleToAscii.put("110000", "B");
        brailleToAscii.put("100100", "C");
        brailleToAscii.put("100110", "D");
        brailleToAscii.put("100010", "E");
        brailleToAscii.put("110100", "F");
        brailleToAscii.put("110110", "G");
        brailleToAscii.put("110010", "H");
        brailleToAscii.put("010100", "I");
        brailleToAscii.put("010110", "J");
        brailleToAscii.put("101000", "K");
        brailleToAscii.put("111000", "L");
        brailleToAscii.put("101100", "M");
        brailleToAscii.put("101110", "N");
        brailleToAscii.put("101010", "O");
        brailleToAscii.put("111100", "P");
        brailleToAscii.put("111110", "Q");
        brailleToAscii.put("111010", "R");
        brailleToAscii.put("011100", "S");
        brailleToAscii.put("011110", "T");
        brailleToAscii.put("101001", "U");
        brailleToAscii.put("111001", "V");
        brailleToAscii.put("101101", "X");
        brailleToAscii.put("101111", "Y");
        brailleToAscii.put("101011", "Z");
        brailleToAscii.put("010111", "W");
        brailleToAscii.put("000000", " "); // Space character
        if (a == 1) {
        Map<String, String> asciiToBraille = new HashMap<>();
        brailleToAscii.forEach((braille, ascii) -> asciiToBraille.put(ascii, braille));
        return asciiToBraille;
        }
        return brailleToAscii;
    }
    public static Map<String, String> getBrailleToUnicodeMap() {
        Map<String, String> brailleToUnicode = new HashMap<>();
        brailleToUnicode.put("000000", "\u2800");
        brailleToUnicode.put("100000", "\u2801");
        brailleToUnicode.put("010000", "\u2802");
        brailleToUnicode.put("110000", "\u2803");
        brailleToUnicode.put("001000", "\u2804");
        brailleToUnicode.put("101000", "\u2805");
        brailleToUnicode.put("011000", "\u2806");
        brailleToUnicode.put("111000", "\u2807");
        brailleToUnicode.put("000100", "\u2808");
        brailleToUnicode.put("100100", "\u2809");
        brailleToUnicode.put("010100", "\u280A");
        brailleToUnicode.put("110100", "\u280B");
        brailleToUnicode.put("001100", "\u280C");
        brailleToUnicode.put("101100", "\u280D");
        brailleToUnicode.put("011100", "\u280E");
        brailleToUnicode.put("111100", "\u280F");
        brailleToUnicode.put("000010", "\u2810");
        brailleToUnicode.put("100010", "\u2811");
        brailleToUnicode.put("010010", "\u2812");
        brailleToUnicode.put("110010", "\u2813");
        brailleToUnicode.put("001010", "\u2814");
        brailleToUnicode.put("101010", "\u2815");
        brailleToUnicode.put("011010", "\u2816");
        brailleToUnicode.put("111010", "\u2817");
        brailleToUnicode.put("000110", "\u2818");
        brailleToUnicode.put("100110", "\u2819");
        brailleToUnicode.put("010110", "\u281A");
        brailleToUnicode.put("110110", "\u281B");
        brailleToUnicode.put("001110", "\u281C");
        brailleToUnicode.put("101110", "\u281D");
        brailleToUnicode.put("011110", "\u281E");
        brailleToUnicode.put("111110", "\u281F");
        brailleToUnicode.put("000001", "\u2820");
        brailleToUnicode.put("100001", "\u2821");
        brailleToUnicode.put("010001", "\u2822");
        brailleToUnicode.put("110001", "\u2823");
        brailleToUnicode.put("001001", "\u2824");
        brailleToUnicode.put("101001", "\u2825");
        brailleToUnicode.put("011001", "\u2826");
        brailleToUnicode.put("111001", "\u2827");
        brailleToUnicode.put("000101", "\u2828");
        brailleToUnicode.put("100101", "\u2829");
        brailleToUnicode.put("010101", "\u282A");
        brailleToUnicode.put("110101", "\u282B");
        brailleToUnicode.put("001101", "\u282C");
        brailleToUnicode.put("101101", "\u282D");
        brailleToUnicode.put("011101", "\u282E");
        brailleToUnicode.put("111101", "\u282F");
        brailleToUnicode.put("000011", "\u2830");
        brailleToUnicode.put("100011", "\u2831");
        brailleToUnicode.put("010011", "\u2832");
        brailleToUnicode.put("110011", "\u2833");
        brailleToUnicode.put("001011", "\u2834");
        brailleToUnicode.put("101011", "\u2835");
        brailleToUnicode.put("011011", "\u2836");
        brailleToUnicode.put("111011", "\u2837");
        brailleToUnicode.put("000111", "\u2838");
        brailleToUnicode.put("100111", "\u2839");
        brailleToUnicode.put("010111", "\u283A");
        brailleToUnicode.put("110111", "\u283B");
        brailleToUnicode.put("001111", "\u283C");
        brailleToUnicode.put("101111", "\u283D");
        brailleToUnicode.put("011111", "\u283E");
        brailleToUnicode.put("111111", "\u283F");
        return brailleToUnicode;
    }
}
