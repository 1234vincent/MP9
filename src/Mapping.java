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
        brailleToUnicode.put("000000", "2800");
        brailleToUnicode.put("100000", "2801");
        brailleToUnicode.put("010000", "2802");
        brailleToUnicode.put("110000", "2803");
        brailleToUnicode.put("001000", "2804");
        brailleToUnicode.put("101000", "2805");
        brailleToUnicode.put("011000", "2806");
        brailleToUnicode.put("111000", "2807");
        brailleToUnicode.put("000100", "2808");
        brailleToUnicode.put("100100", "2809");
        brailleToUnicode.put("010100", "280A");
        brailleToUnicode.put("110100", "280B");
        brailleToUnicode.put("001100", "280C");
        brailleToUnicode.put("101100", "280D");
        brailleToUnicode.put("011100", "280E");
        brailleToUnicode.put("111100", "280F");
        brailleToUnicode.put("000010", "2810");
        brailleToUnicode.put("100010", "2811");
        brailleToUnicode.put("010010", "2812");
        brailleToUnicode.put("110010", "2813");
        brailleToUnicode.put("001010", "2814");
        brailleToUnicode.put("101010", "2815");
        brailleToUnicode.put("011010", "2816");
        brailleToUnicode.put("111010", "2817");
        brailleToUnicode.put("000110", "2818");
        brailleToUnicode.put("100110", "2819");
        brailleToUnicode.put("010110", "281A");
        brailleToUnicode.put("110110", "281B");
        brailleToUnicode.put("001110", "281C");
        brailleToUnicode.put("101110", "281D");
        brailleToUnicode.put("011110", "281E");
        brailleToUnicode.put("111110", "281F");
        brailleToUnicode.put("000001", "2820");
        brailleToUnicode.put("100001", "2821");
        brailleToUnicode.put("010001", "2822");
        brailleToUnicode.put("110001", "2823");
        brailleToUnicode.put("001001", "2824");
        brailleToUnicode.put("101001", "2825");
        brailleToUnicode.put("011001", "2826");
        brailleToUnicode.put("111001", "2827");
        brailleToUnicode.put("000101", "2828");
        brailleToUnicode.put("100101", "2829");
        brailleToUnicode.put("010101", "282A");
        brailleToUnicode.put("110101", "282B");
        brailleToUnicode.put("001101", "282C");
        brailleToUnicode.put("101101", "282D");
        brailleToUnicode.put("011101", "282E");
        brailleToUnicode.put("111101", "282F");
        brailleToUnicode.put("000011", "2830");
        brailleToUnicode.put("100011", "2831");
        brailleToUnicode.put("010011", "2832");
        brailleToUnicode.put("110011", "2833");
        brailleToUnicode.put("001011", "2834");
        brailleToUnicode.put("101011", "2835");
        brailleToUnicode.put("011011", "2836");
        brailleToUnicode.put("111011", "2837");
        brailleToUnicode.put("000111", "2838");
        brailleToUnicode.put("100111", "2839");
        brailleToUnicode.put("010111", "283A");
        brailleToUnicode.put("110111", "283B");
        brailleToUnicode.put("001111", "283C");
        brailleToUnicode.put("101111", "283D");
        brailleToUnicode.put("011111", "283E");
        brailleToUnicode.put("111111", "283F");
        return brailleToUnicode;
    }
}
