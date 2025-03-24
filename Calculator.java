class Calculator{
    public static void add(int number, int anotherNumber){
        int total=number+anotherNumber;
        System.out.println("total is "+total);
    }
    public static void subtract(int number,int anotherNumber){
        int total=number-anotherNumber;
        System.out.println("total is "+total);
    }
    public static void multiply(int number,int anotherNumber){
        int fact=number*anotherNumber;
        System.out.println("fact is"+fact);
}public static void divide(int number,int anotherNumber){
    if(anotherNumber!=0){
        int result=number/anotherNumber;
    }
        else{
            System.out.println("division is not possible");
        }
    
}}