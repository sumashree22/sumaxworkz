class CharecterArray {
    static char[] chars = {' ', '/', 'a', 'A', '{', '%', '7', 'B', '*', '2'};
    public static void main(String[] args) {
        
        System.out.println(chars[0] + " " + chars[1] + " " + chars[2] + " " + chars[3] + " " + chars[4] + " " +chars[5] + " " + chars[6] + " " + chars[7] + " " + chars[8] + " " + chars[9]);
        getChars();
        
    }
    public static void getChars(){
        for(char reference:chars){
            System.out.print( "  "+reference);
        }
    }
}
