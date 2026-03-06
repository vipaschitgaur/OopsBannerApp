import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {
    public static Map<Character, String[]> buildPatternMap() {
        Map<Character, String[]> patternMap = new HashMap<>();
        patternMap.put('O', getPatternO());
        patternMap.put('P', getPatternP());
        patternMap.put('S', getPatternS());
        return patternMap;
    }

    public static void printMessage(String message, Map<Character, String[]> patterns){
        int height = patterns.get('O').length; // assuming all patterns have the same height
        for (int i = 0; i < height; i++) {
            String row = "";
            for (char c : message.toCharArray()) {
                String[] charPattern = patterns.get(c);
                row += charPattern[i] + "  ";
            }
            System.out.println(row);
        }
    }
    
    // patterns for O, P, and S
    public static String[] getPatternO(){
        String[] patternO = {
            String.join("", "    ", "***", "   "),
            String.join("", "   ", "*", "   ", "*", "  "),
            String.join("", "   ", "*", "   ", "*", "  "),
            String.join("", "   ", "*", "   ", "*", "  "),
            String.join("", "   ", "*", "   ", "*", "  "),
            String.join("", "    ", "***", "   ")
        };
        return patternO;
    }

    public static String[] getPatternP(){
        String[] patternP = {
            String.join("", "   ", "****", "   "),
            String.join("", "  ", "*", "    ", "*", "  "),
            String.join("", "  ", "*", "    ", "*", "  "),
            String.join("", "  ", "****", "    "),
            String.join("", "  ", "*", "       "),
            String.join("", "  ", "*", "       ")
        };
        return patternP;
    }

    public static String[] getPatternS(){
    String[] patternS = {
        String.join("", "  ", "****", " "),
        String.join("", " ", "*", "     "),
        String.join("", "  ", "***", "  "),
        String.join("", "     ", "*", " "),
        String.join("", "     ", "*", " "),
        String.join("", "  ", "****", " ")
    };
    return patternS;
}  

    public static void main(String[] args) {
        Map<Character, String[]> patterns = buildPatternMap();
        String message = "OOPS";
        printMessage(message, patterns);
    }
}
