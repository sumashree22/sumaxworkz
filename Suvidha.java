class Suvidha {
 static String[] groceries = {"Rice", "Wheat", "Sugar", "Salt", "Oil", "Pulses", "Spices", "Coffe", "Flour", "Tea"};
      static  String[] perfumes = {"plum", "Wottegirl", "Tom Ford Noir", "Yves Saint Laurent", "Gucci Bloom", "Armani Code", "Paco Rabanne", "Versace Eros", "Burberry Her", "Creed Aventus"};
       static String[] biscuits = {"Oreo", "Good day", "Parle-G", "Hide & Seek", "Bourbon", "Jim Jam", "Treat", "Little Debbie", "Marie", "Britannia"};
       static String[] utensils = {"Spoon", "Fork", "Knife", "Plates", "Glass", "Cup", "Serving Bowl", "Pan", "Frying Pan", "Kettle"};
      static  String[] vegetables = {"Carrot", "Potato", "Tomato", "Onion", "Cucumber", "Spinach", "Lettuce", "Broccoli", "Cauliflower", "Peas"};
    public static void main(String[] args) {
        
        System.out.println(groceries[0] + " " + groceries[1] + " " + groceries[2] + " " + groceries[3] + " " + groceries[4] + " " + groceries[5] + " " + groceries[6] + " " + groceries[7] + " " + groceries[8] + " " + groceries[9]);
        System.out.println(perfumes[0] + " " + perfumes[1] + " " + perfumes[2] + " " + perfumes[3] + " " + perfumes[4] + " " +perfumes[5] + " " + perfumes[6] + " " + perfumes[7] + " " + perfumes[8] + " " + perfumes[9]);
        System.out.println(biscuits[0] + " " + biscuits[1] + " " + biscuits[2] + " " + biscuits[3] + " " + biscuits[4] + " " +biscuits[5] + " " + biscuits[6] + " " + biscuits[7] + " " + biscuits[8] + " " + biscuits[9]);
        System.out.println(utensils[0] + " " + utensils[1] + " " + utensils[2] + " " + utensils[3] + " " + utensils[4] + " " +utensils[5] + " " + utensils[6] + " " + utensils[7] + " " + utensils[8] + " " + utensils[9]);
        System.out.println(vegetables[0] + " " + vegetables[1] + " " + vegetables[2] + " " + vegetables[3] + " " + vegetables[4] + " " +vegetables[5] + " " + vegetables[6] + " " + vegetables[7] + " " + vegetables[8] + " " + vegetables[9]);
    getBiscuits();
    getPerfumes();
    getVegitables();
    getGroceries();
    getUtensil();
      }
       public static void getGroceries(){
        for(String ref:groceries){
        System.out.println(ref);

     }
     
    
    }
     public static void getPerfumes(){
        for(String ref1:perfumes){
        System.out.println(ref1);

     }
     
    
    }
     public static void getUtensil(){
        for(String ref2:utensils){
        System.out.println(ref2);

     }
     
     }
    public static void getBiscuits(){
        for(String ref3:biscuits){
        System.out.println(ref3);

     }
      }
      public static void getVegitables(){
        for(String ref4: vegetables){
        System.out.println(ref4);

     }
     
    
    }
    

}
