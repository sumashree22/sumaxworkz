class CoffeeStall{
    static String name="Coffe day";
    public static void main(String[] args){
        System.out.println(name);
        name="coffe in";
        System.out.println("name of the cofee stall is   "+name);
        update();
        
    }
    public static void update(){
        name="coffe planet";
        System.out.println("the new name is "+name);
    }
}