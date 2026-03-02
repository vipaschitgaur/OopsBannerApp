public class OOPSBannerApp {
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
            String.join("", "  *       ")
        };
        return patternP;
    }

    public static String[] getPatternS(){
        String[] patternS = {
            String.join("", "  ", "****", " "),
            String.join("", " *     "),
            String.join("", "  ***  "),
            String.join("", "     * "),
            String.join("", "     * "),
            String.join("", "  **** ")
        };
        return patternS;
    }  

    public static void main(String[] args){

        String[] patternO = getPatternO();
        String[] patternP = getPatternP();
        String[] patternS = getPatternS();
        for (int i =0; i<patternO.length; i++){
            System.out.println(patternO[i] + "  " + patternO[i] + "   " + patternP[i] + "   " + patternS[i]);
        }
    }
}
