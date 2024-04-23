import java.util.Map;

public class Braille_trees {
    public static String toBarille(char letter){
        Map<String, String> something = Mapping.getBrailleToAsciiMap(1);//1 to reverse the map 
        return something.get(Character.toString(letter));
    }
    
    public static String toASCII(String bits){
        Map<String, String> something = Mapping.getBrailleToAsciiMap(0);
        return something.get(bits);
    }

    public static String toUnicode(String bits){
        Map<String, String> something = Mapping.getBrailleToUnicodeMap();
        return something.get(bits);
    }
}
