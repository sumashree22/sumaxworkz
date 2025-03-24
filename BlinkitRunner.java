class BlinkitRunner{
    public static void main(String args[]){
        double price=Blinkit.search("kulfi");
        System.out.println(price);
        double price1=Blinkit.search("dumplings");
        System.out.println(price1);
        double price2=Blinkit.search("Brownie");
        System.out.println(price2);
    }
}