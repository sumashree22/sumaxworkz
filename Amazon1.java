class Amazon1{
    int id;
    String name;
    String password;
    String emailId;
    //to avoid ambiguity between parametric and instance variables for compilor we use this keyword
    //we can use inside construcor or non static methods
    Amazon1(){
        this(1);
        System.out.println("no argument constructor");
    }

    Amazon1(int id){
        this("baba","singh");
        this.id= id;
        System.out.println("one argument constructor that is is");
       
}
Amazon1(String name,String password){
    this("suma@gmail.com");
    this.name=  name;
    this.password = password;
    System.out.println("two argument constructor that is name and password");
    
}
Amazon1(String emailId){
    this.emailId = emailId;
    System.out.println("one argument constructor that is emailId");

}

public void display(){
    //using this keyword to access the instance variables
    //this is not mandotory here but it is a best practice
    System.out.println("***************************************");
    System.out.println("user id is "+this.id);
    System.out.println("user name is "+name);
    System.out.println("User password is "+ this.password);
    System.out.println("user email adress is "+emailId);
    System.out.println("***********************************");
}}