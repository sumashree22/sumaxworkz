class CoffeMachine {
   static int CoffeeMachineid = 2420;
      static  String brand = "Nespresso";
     static   String model = "Vertuo Next";
     static   int waterTankCapacity = 1; // in liters
     static   boolean hasMilkFrother = true;
     static   boolean isAutomatic = true;
     static   int price = 19999;
      static  String color = "Red";
    public static void main(String args[]) {
        System.out.println("CoffeeMachineid is: " + CoffeeMachineid);
        System.out.println("Brand is: " + brand);
        System.out.println("Model is: " + model);
        System.out.println("Water Tank Capacity is: " + waterTankCapacity + " L");
        System.out.println("Milk Frother is: " + hasMilkFrother);
        System.out.println("Automatic is: " + isAutomatic);
        System.out.println("Price is: Rs " + price);
        System.out.println("Color is : " +color);
		 CoffeeMachineid = 2320;
         brand = "Hero";
         model = "Vertuo Next01";
        waterTankCapacity =2;
         hasMilkFrother = false;
        isAutomatic = true;
         price = 19999;
         color = "pink";
		System.out.println("CoffeeMachineid is: " + CoffeeMachineid);
        System.out.println("Brand is: " + brand);
        System.out.println("Model is: " + model);
        System.out.println("Water Tank Capacity is: " + waterTankCapacity + " L");
        System.out.println("Milk Frother is: " + hasMilkFrother);
        System.out.println("Automatic is: " + isAutomatic);
        System.out.println("Price is: Rs " + price);
        System.out.println("Color is : " +color);
        updateCoffeMachineInfo();
}
public static void updateCoffeMachineInfo(){
    CoffeeMachineid = 2330;
         brand = "Hero2";
         model = "Vertuo Next01";
        waterTankCapacity =4; // in liters
         hasMilkFrother = false;
        isAutomatic = true;
         price = 19899;
         color = "blue";

}
}