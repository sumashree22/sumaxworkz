public class SwiggyRunner
 {
    public static void main(String[] args) {
        double price=Swiggy.searchFood("Neer dosa");
        System.out.println(price);
        double price1= Swiggy.searchFood("tellevu");
        System.out.println(price1);
        double price2= Swiggy.searchFood("parota");
        System.out.println(price2);
        double price3= Swiggy.searchFood("obbattu");
        System.out.println(price3);
        double price4= Swiggy.searchFood("Kajjaya");
        System.out.println(price4);
        double price5= Swiggy.searchFood("Kotte kadubu");
        System.out.println(price5);
    }
    
}