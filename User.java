public class User{
    public static void main(String [] a){
    
   
    long adharNumber=1234567891L;
    char gender='F';
    String emailId="sampekai22@gmail.com";
    int age=80;
    boolean isAlive=true;
    String nationality="Indian";
    String adress="rajajinagar";
    String fatherName="raghu";
    String motherName="sita";
    String bloodGroup="O-";
    User obj=new  User();
    String phone=obj.ram("radha");


    System.out.println(" user name is Name: "+phone);

    System.out.println("user adhar number is :"+adharNumber);
    System.out.println("user gender is :"+gender);
    System.out.println("user email Id is:"+emailId);
    System.out.println("user age is:"+age);
    System.out.println("is he alive:"+isAlive);
    System.out.println("user nationality:"+nationality);
    System.out.println("user adress is:"+adress);
    System.out.println(" user father name is:"+fatherName);
    System.out.println(" user mother name is:"+motherName);
    System.out.println("user bloodb group is:"+bloodGroup);

    }
    public String ram( String name){
    
    
    return name;

    }
}