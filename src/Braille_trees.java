import java.util.Map;

public class Braille_trees {
    public static String toBraille(char letter){
        Map<String, String> something = Mapping.getBrailleToAsciiMap(1);//1 to reverse the map 
        String result = something.get(Character.toString(letter));
        if (result == null) {
            return "?";  
        }
        return result;
    }
    
    public static String toASCII(String bits){
        Map<String, String> something = Mapping.getBrailleToAsciiMap(0);
        String result = something.get(bits);
        if (result == null) {
            return "?";  
        }
        return result;
    }

    public static String toUnicode(String bits){
        Map<String, String> something = Mapping.getBrailleToUnicodeMap();
        String result = something.get(bits);
        if (result == null) {
            return "?";  
        }
        return result;
    }
}
