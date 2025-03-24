class Snapchat {
public static String userRegistration(String firstName, String lastName, String phoneNumber, 
String dob, String gender, String password, String confirmPassword) {
        String ref = null;
        boolean userValid = validateUserProfile(firstName, lastName, phoneNumber, dob, gender, password, confirmPassword);

        if (userValid) {
            ref = "Registration successful!";
        } else {
            ref = "Registration failed. Please try again later.";
        }
        return ref;
    }

    public static boolean validateUserProfile(String firstName, String lastName, String phoneNumber, String dob, String gender, String password, String confirmPassword) {
        boolean userValid = false;
        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isPhoneNumberValid = false;
        boolean isDobValid = false;
        boolean isGenderValid = false;
        boolean isPasswordValid = false;
        boolean isConfirmPasswordValid = false;

        if (firstName != null && firstName.length() >= 3) {
            isFirstNameValid = true;
        } 
        else {
            System.out.println("First name is invalid. Please provide a valid first name.");
        }

        if (lastName != null && lastName.length() >= 1&&!lastName.isEmpty()) {
            isLastNameValid = true;
        } 
        else {
            System.out.println("Last name is invalid. Please provide a valid last name.");
        }

        if (phoneNumber != null && phoneNumber.length() == 10) {
            isPhoneNumberValid = true;
        } 
        else {
            System.out.println("Phone number is invalid");
        }

        if (dob != null&&!dob.isEmpty()) {
            isDobValid = true;
        } 
        else {
            System.out.println("Date of birth is invalid. Please provide a valid date.");
        }

        if (gender != null&&!gender.isEmpty()) {
            isGenderValid = true;
        }
         else {
            System.out.println("Gender is invalid. Please provide a valid gender.");
        }

        if (password != null && password.length() >= 6&&!password.isEmpty()) {
            isPasswordValid = true;
        } else {
            System.out.println("Password is invalid. It should be at least 6 characters long.");
        }

        if (confirmPassword != null && confirmPassword==password) {
            isConfirmPasswordValid = true;
        } 
        else {
            System.out.println("Confirm password doesn't match the original password.");
        }

        if (isFirstNameValid==true && isLastNameValid==true && isPhoneNumberValid==true && isDobValid==true && isGenderValid==true && isPasswordValid==true && isConfirmPasswordValid==true) {
            userValid = true;
        }

        return userValid;
    }
}
