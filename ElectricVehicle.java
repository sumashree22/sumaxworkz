class ElectricVehicle {
  static  int ElectricBicycleid = 6542;
     static   String brand = "Rad Power Bikes";
    static    String model = "RadRover 6 Plus";
   static     int maxSpeed = 32; 
    static    int batteryRange = 72; 
    static    boolean isPedalAssist = true;
      static  int price = 19999;
     static   String color = "Black";
    public static void main(String args[]) {
        System.out.println("ElectricBicycleid is: " + ElectricBicycleid);
        System.out.println("Brand is : " + brand);
        System.out.println("Model is: " + model);
        System.out.println("Max Speed is: " + maxSpeed + " km/h");
        System.out.println("Battery Range is: " + batteryRange + " km");
        System.out.println("Pedal Assist is: " + isPedalAssist);
        System.out.println("Price is: Rs " + price);
        System.out.println("Color is: " +color);
         ElectricBicycleid = 6842;
         brand = "Hero";
         model = "RadRover 5 Plus";
         maxSpeed = 34; 
         batteryRange = 82; 
         isPedalAssist = false;
        price = 19999;
         color = "white";
		
		System.out.println("ElectricBicycleid is: " + ElectricBicycleid);
        System.out.println("Brand is : " + brand);
        System.out.println("Model is: " + model);
        System.out.println("Max Speed is: " + maxSpeed + " km/h");
        System.out.println("Battery Range is: " + batteryRange + " km");
        System.out.println("Pedal Assist is: " + isPedalAssist);
        System.out.println("Price is: Rs " + price);
        System.out.println("Color is: " +color);
        update();
}
public static void update(){
    ElectricBicycleid = 842;
         brand = "Hero Honda";
         model = "RadRover 3 Plus";
         maxSpeed = 94; 
         batteryRange = 22; 
         isPedalAssist = false;
        price = 19999;
         color = "pink";
         System.out.println("ElectricBicycleid is: " + ElectricBicycleid);
        System.out.println("Brand is : " + brand);
        System.out.println("Model is: " + model);
        System.out.println("Max Speed is: " + maxSpeed + " km/h");
        System.out.println("Battery Range is: " + batteryRange + " km");
        System.out.println("Pedal Assist is: " + isPedalAssist);
        System.out.println("Price is: Rs " + price);
        System.out.println("Color is: " +color);
}

}
