class Amazon{
    int id;
    String name;
    String password;
    String emailId;
    //to avoid ambiguity between parametric and instance variables for compilor we use this keyword
    //we can use inside construcor or non static methods

    Amazon(int id,String name,String password,String email){
        this.id=id;
        this.name=name;
        this.password=password;
        this.emailId=email;
}
public void displayDetails(){
    //using this keyword to access the instance variables
    //this is not mandotory here but it is a best practice
    System.out.println("user id is "+this.id);
    System.out.println("user name is "+name);
    System.out.println("User password is "+ this.password);
    System.out.println("user email adress is "+emailId);
    System.out.println("***********************************");
}}