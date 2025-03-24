class ITCompany {
   static String[] itCompanies = {
            "Apple", "microsoft", "Google", "Amazon", "Facebook", "IBM", "Oracle", "Intel", "Cisco", "HP",
            "Adobe", "SAP", "Dell", "Accenture", "TCS", "Infosys", "Wipro", "Capgemini", "Cognizant", "HCL",
            "Qualcomm", "VMware", "Salesforce", "Atos", "Tech Mahindra", "Mindtree", "L&T Technology Services", 
            "DXC Technology", "Samsung", "Siemens", "Ntt Data", "Tech Mahindra", "Sony", "Nokia", "Huawei", "LG Electronics", 
            "ServiceNow", "Red Hat", "Micron", "Snapchat", "Twitter", "Zoom", "Spotify", "Pinterest"
        };
    public static void main(String[] args) {
        
        System.out.println(itCompanies[0] + " " + itCompanies[1] + " " + itCompanies[2] + " " + itCompanies[3] + " " + itCompanies[4] 
        + " " +itCompanies[5] + " " + itCompanies[6] + " " + itCompanies[7] + " " + itCompanies[8] + " " + itCompanies[9] + " " +
        itCompanies[10] + " " + itCompanies[11] + " " + itCompanies[12] + " " + itCompanies[13] + " " + itCompanies[14] + " " +
        itCompanies[15] + " " + itCompanies[16] + " " + itCompanies[17] + " " + itCompanies[18] + " " + itCompanies[19] + " " +
    itCompanies[20] + " " + itCompanies[21] + " " + itCompanies[22] + " " + itCompanies[23] + " " + itCompanies[24] + " " +
        itCompanies[25] + " " + itCompanies[26] + " " + itCompanies[27] + " " + itCompanies[28] + " " + itCompanies[29] + " " +
        itCompanies[30] + " " + itCompanies[31] + " " + itCompanies[32] + " " + itCompanies[33] + " " + itCompanies[34] + " " +
        itCompanies[35] + " " + itCompanies[36] + " " + itCompanies[37] + " " + itCompanies[38] + " " + itCompanies[39]);
  getITCompany();
    
}
public static void getITCompany(){
    for(String ref:itCompanies){
        System.out.println(ref);
    }
}
}
