class Amazon{
    public static String userRegistration(String firstName,String lastName,Long phoneNumber,String dob,String gender){
        String ref=null;
        boolean UserValid=validateUserProfile(firstName,lastName,phoneNumber,dob,gender);
        if(UserValid==true){
            ref="Registration succesfull";
        }
        else{
            ref="registration fails Please try again later";
        }
        return ref;

    }
    public static boolean validateUserProfile(String firstName,String lastName,Long phoneNumber,String dob,String gender){
        boolean userValid=false;
        boolean isFirstNameValid=false;
        boolean islastNameValid=false;
        boolean  isPhoneNumberValid=false;
        boolean isDobValid=false;
        boolean isGendervalid=false;
        if(firstName!=null&&firstName.length()>=3){
            isFirstNameValid=true;
        }
        else{
            System.out.println("first name is invalid ,please provide a proper first name");
        }
        if(lastName!=null && lastName.length()>=1){
            islastNameValid=true;
        }
        else{
            System.out.println("last name is invalid, please provide a valid last name");
        }
        if(phoneNumber!=0 && phoneNumber.length()==10){
            isPhoneNumberValid=true;
        }
        else{
            System.out.println("phone number is invalid please proviode a proper phone number");
        }
        if(dob!=null){
            isDobValid=true;
        }
        else{
            System.out.println("dob is invalid,please provide a valid dob");
        }
        if(gender!=null)
        isGendervalid=true;
        else
        System.out.println("please enter a gender");
        if(  isFirstNameValid==true&& islastNameValid==true&& isPhoneNumberValid==true&&isDobValid==true&&isGendervalid==true){
            return userValid=true;
        }else
        return userValid=false;
    }
}