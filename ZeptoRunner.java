class ZeptoRunner{
    public static void main(String args[]){
        double price=Zepto.search("kulcha");
        System.out.println(price);
        double price1=Zepto.search("Dum aloo");
        System.out.println(price1);
        double price2=Zepto.search("Butter chicken");
        System.out.println(price2);
        double price3=Zepto.search("kadai chicken");
        System.out.println(price3);
        double price4=Zepto.search("uujj");
        System.out.println(price4);
    }
}