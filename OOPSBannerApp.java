public class OOPSBannerApp {
    static class CharacterPatternMap{
        private final char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern){
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter(){
            return character;
        }

        public String[] getPattern(){
            return pattern;
        }

        public static CharacterPatternMap[] createCharacterPatternMaps(){
            CharacterPatternMap[] maps =new CharacterPatternMap[3];
            maps[0] = new CharacterPatternMap('O', getPatternO());
            maps[1] = new CharacterPatternMap('P' , getPatternP());
            maps[2] = new CharacterPatternMap('S', getPatternS());
            return maps;
        }

        public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps){
            for (CharacterPatternMap m : charMaps){
                if (m.getCharacter()==ch) 
                    return m.pattern;
            }
            return null;
        }
        public static void printMessage(String message, CharacterPatternMap[] charMaps){
            String output = "";
            int height = charMaps[0].pattern.length; // assuming all patterns have the same height
            for (int i =0; i< height; i++){
                String row = "";
                for (char c : message.toCharArray()){
                    String[] charPattern = getCharacterPattern(c, charMaps);
                    row += charPattern[i] + "  ";
                    output+=row;
                }
                System.out.println(row);
             }

        }
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
    }
    public static void main(String[] args){

        CharacterPatternMap[] charMaps = CharacterPatternMap.createCharacterPatternMaps();
        String message = "OOPS";
        
        CharacterPatternMap.printMessage(message, charMaps);
        }

    }
