public class UberEatsRunner {
    public static void main(String[] args) {
        double price= UberEats.search("burhers and fries");
        System.out.println(price);
        double price1= UberEats.search("mac and cheese");
        System.out.println(price1);
        double price2= UberEats.search("hot dogs");
        System.out.println(price2);
        double price3= UberEats.search("barbecue");
        System.out.println(price3);
        double price4= UberEats.search("fried chicken");
        System.out.println(price4);
    }
    
}