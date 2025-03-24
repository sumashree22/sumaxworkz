public class OlaEatsRunner{
    public static void main(String[] args) {
        double price=OlaEats.searchFood("oi kimchi");
        System.out.println(price);
        double price1= OlaEats.searchFood("huraideu chicken");
        System.out.println(price1);
        double price2= OlaEats.searchFood("dudu jorim");
        System.out.println(price2);
        double price3= OlaEats.searchFood("huraideu chicken");
        System.out.println(price3);
        double price4= OlaEats.searchFood("padak");
        System.out.println(price4);
        double price5= OlaEats.searchFood(" kadubu");
        System.out.println(price5);
    }
    
}