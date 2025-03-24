class HairDryer {
   static int hairdryer = 6754;
    static    String brand = "Dyson";
    static    String model = "Supersonic";
      static  int power = 1600; // in watts
      static  boolean hasIonicTechnology = true;
      static  boolean hasHeatControl = true;
      static  int price = 4299;
      static  String color = "Silver";
    public static void main(String args[]) {
        System.out.println("Hairdryer is: " + hairdryer);
        System.out.println("Brand is: " + brand);
        System.out.println("Model is: " + model);
        System.out.println("Power is: " + power + " W");
        System.out.println("Ionic Technology is: " + hasIonicTechnology);
        System.out.println("Heat Control is: " + hasHeatControl);
        System.out.println("Price is: Rs" + price);
        System.out.println("Color is: " +color);
        System.out.println("**************************************************************");
		 hairdryer = 6754;
        brand = "Dyson2";
         model = "Ultrasonic";
         power = 1800; // in watts
         hasIonicTechnology = false;
         hasHeatControl = true;
         price = 4229;
        color = "black";
		System.out.println("Hairdryer is: " + hairdryer);
        System.out.println("Brand is: " + brand);
        System.out.println("Model is: " + model);
        System.out.println("Power is: " + power + " W");
        System.out.println("Ionic Technology is: " + hasIonicTechnology);
        System.out.println("Heat Control is: " + hasHeatControl);
        System.out.println("Price is: Rs" + price);
        System.out.println("Color is: " +color);
        System.out.println("**************************************************************");
        updateHairDryerInfo();
}
public static void updateHairDryerInfo(){
    hairdryer = 3754;
        brand = "Dyson4";
         model = "sonic";
         power = 1200; // in watts
         hasIonicTechnology = true;
         hasHeatControl = true;
         price = 4239;
        color = "White";
        System.out.println("Hairdryer is: " + hairdryer);
        System.out.println("Brand is: " + brand);
        System.out.println("Model is: " + model);
        System.out.println("Power is: " + power + " W");
        System.out.println("Ionic Technology is: " + hasIonicTechnology);
        System.out.println("Heat Control is: " + hasHeatControl);
        System.out.println("Price is: Rs" + price);
        System.out.println("Color is: " +color);

}
}