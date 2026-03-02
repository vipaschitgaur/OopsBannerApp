public class OOPSBannerApp {
    public static String[] getPatternO(){
        String[] patternO = {
            "    ***   ",
            "   *   *  ",
            "   *   *  ",
            "   *   *  ",
            "   *   *  ",
            "    ***   "
        };
        return patternO;
    }

    public static String[] getPatternP(){
        String[] patternP = {
            "   ****   ",
            "  *    *  ",
            "  *    *  ",
            "  ****    ",
            "  *       ",
            "  *       "
        };
        return patternP;
    }

    public static String[] getPatternS(){
        String[] patternS = {
            "  **** ",
            " *     ",
            "  ***  ",
            "     * ",
            "     * ",
            "  **** "
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
