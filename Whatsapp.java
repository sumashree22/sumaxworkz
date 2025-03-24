class Whatsapp{
public static String userRegistration(String name, String phoneNumber, String dob, String gender, String password, String confirmPassword, String email) {
        String ref = null;
        boolean userValid = validateUserProfile(name, phoneNumber, dob, gender, password, confirmPassword, email);

        if (userValid)
            ref = "Registration successful!";
        else
            ref = "Registration failed. Please try again later.";

        return ref;
    }

    public static boolean validateUserProfile(String name, String phoneNumber, String dob, String gender, String password, String confirmPassword, String email) {
        boolean userValid = false;
        boolean isNameValid = false;
        boolean isPhoneNumberValid = false;
        boolean isDobValid = false;
        boolean isGenderValid = false;
        boolean isPasswordValid = false;
        boolean isConfirmPasswordValid = false;
        boolean isEmailValid = false;

        if (name != null && name.length() >= 3 && !name.isEmpty())
            isNameValid = true;
        else
            System.out.println("Name is invalid. Please provide a valid name.");

        if (phoneNumber != null && phoneNumber.length() == 10)
            isPhoneNumberValid = true;
        else
            System.out.println("Phone number is invalid. Please provide a valid 10-digit phone number.");

        if (dob != null&&!dob.isEmpty())
            isDobValid = true;
        else
            System.out.println("Date of birth is invalid. Please provide a valid date.");

        if (gender != null && !gender.isEmpty())
            isGenderValid = true;
        else
            System.out.println("Gender is invalid. Please provide a valid gender.");

        if (password != null && password.length() >= 6 &&!password.isEmpty())
            isPasswordValid = true;
        else
            System.out.println("Password is invalid. It should be at least 6 characters long.");

        if (confirmPassword != null && confirmPassword==password)
            isConfirmPasswordValid = true;
        else
            System.out.println("Confirm password doesn't match the original password.");

        if (email != null && !email.isEmpty())
            isEmailValid = true;
        else
            System.out.println("Email is invalid. Please provide a valid email address.");

        if (isNameValid==true && isPhoneNumberValid==true && isDobValid==true && isGenderValid==true && isPasswordValid==true && isConfirmPasswordValid==true && isEmailValid==true)
           return  userValid = true;

        return userValid;
    }
}
