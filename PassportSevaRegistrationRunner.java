class PassportSevaRegistrationRunner {
    public static void main(String[] args) {
        String registrationMessage = PassportSevaRegistration.userRegistration(
            "PO", "Bengaluru", "sumashree", "H M", "22/07/2003", "sumashreehm22gmail.com", "false", 
            "sumashreehm22@gmail.com", "Suma@123", "Suma@123","SNPS", "SNPS", "YRDQ7EF" );
        System.out.println(registrationMessage);
        return;
    }
}
