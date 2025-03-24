class PinCodes {
   static String [] pinCodes = {"11081", "010002", "116003", "510007", "430005", "1440006", "110906", "110908", "110089", "113419"};
    public static void main(String[] args) {
       
        System.out.println(pinCodes[0] + " " + pinCodes[1] + " " + pinCodes[2] + " " + pinCodes[3] + " " + pinCodes[4] + " " +pinCodes[5] + " " + pinCodes[6] + " " + pinCodes[7] + " " + pinCodes[8] + " " + pinCodes[9]);
        getPinCodes();
      }
      public static void getPinCodes(){

        for(String reference:pinCodes){
          System.out.println(reference);
        }
        
      }
}
