class Uber{
    public static String userLogin(String phoneNumber, String password) {
        String ref = null;
        boolean userValid = validateUserLogin(phoneNumber, password);

        if (userValid) {
            ref = "Login successful! Welcome to Uber.";
        } else {
            ref = "Login failed. Please check your phone number and password.";
        }
        return ref;
    }

    public static boolean validateUserLogin(String phoneNumber, String password) {
        boolean userValid = false;
        boolean isPhoneNumberValid = false;
        boolean isPasswordValid = false;


        if (phoneNumber != null && phoneNumber.length() == 10) {
            isPhoneNumberValid = true;
        }

        if (password != null && password.length() >= 6) {
            isPasswordValid = true;
        
        if (isPhoneNumberValid && isPasswordValid) {
            userValid = true;
        }
        }
        return userValid;
    }
}
