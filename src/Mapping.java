import java.util.HashMap;
import java.util.Map;

public class Mapping {
    public static Map<String, String> brailleToAscii = new HashMap<>();
    public static Map<String, String> getBrailleToAsciiMap() {
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
        
        return brailleToAscii;
    }
}
