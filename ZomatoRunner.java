public class ZomatoRunner {
    public static void main(String[] args) {
        double price= Zomato.search("masala dosa");
        System.out.println(price);
        double price1= Zomato.search("chole bhature");
        System.out.println(price1);
        double price2= Zomato.search("Kaju Buttur Masala");
        System.out.println(price2);
        double price3= Zomato.search("Rooti");
        System.out.println(price3);
        double price4= Zomato.search("pulav");
        System.out.println(price4);
    }
    
}