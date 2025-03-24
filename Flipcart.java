class Flipcart {
    
    public static String userRegistration(String firstName, String lastName, String phoneNumber, String dob, String gender, String password) {
        String ref = null;
        boolean userValid = validateUserProfile(firstName, lastName, phoneNumber, dob, gender, password);
        
        if (userValid) {
            ref = "Registration successful!";
        } else {
            ref = "Registration failed. Please try again later.";
        }
        return ref;
    }

    public static boolean validateUserProfile(String firstName, String lastName, String phoneNumber, String dob, String gender, String password) {
        boolean userValid=false;
        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isPhoneNumberValid = false;
        boolean isDobValid = false;
        boolean isGenderValid = false;
        boolean isPasswordValid = false;
        if (firstName != null && firstName.length() >= 3) {
            isFirstNameValid = true;
        } else {
            System.out.println("First name is invalid. Please provide a proper first name");
        }

    
        if (lastName != null && lastName.length() >=1 && !lastName.isEmpty()) {
            isLastNameValid = true;
        } 
        else {
            System.out.println("Last name is invalid. Please provide a valid last name.");
        }

        if (phoneNumber != null && phoneNumber.length() == 10) {
            isPhoneNumberValid = true;
        } 
        else {
            System.out.println("Phone number is invalid. Please provide a 10-digit phone number.");
        }
        if (dob != null && !dob.isEmpty()) {
            isDobValid = true;
        } 
        else {
            System.out.println("Date of birth is invalid. Please provide a valid ");
        }
        if (gender != null && !gender.isEmpty()) {
            isGenderValid = true;
        } 
        else {
            System.out.println("Gender is invalid. Please provide a valid gender");
        }

        if (password != null && password.length() >=8 &&!password.isEmpty()) {
            isPasswordValid = true;
        } else {
            System.out.println("Password is invalid. It should be at least 8 characters long.");
        }

        if(  isFirstNameValid==true&&  isLastNameValid==true&&isPhoneNumberValid&&isDobValid==true&&isGenderValid== true&&isPasswordValid==true){
            return userValid=true;
        }
        else{
            return userValid;
        }









    }
}
