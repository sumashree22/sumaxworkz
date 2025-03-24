class Netflix{
   static  String[] hindiSeries = {"MissMatched", "Mirzapur" , "litle Things", "The Family Man", "Inside Edge", "Breathe", "Tumbbad", "Made In Heaven","night Manager","laakhon mein ek"};
      static  String[] kannadaSeries = {"Kashmir Files", "Pelli Sandadi", "Artha", "Chandana", "Dandupalya", "Dore", "Hatrick", "Naanu Hemanth", "Sakkare", "Gundagali"};
       static String[] malayalamMovies = {"Drishyam", "Premam", "Bangalore Days", "Kalyana Samayal Saadham", "Kumbalangi Nights", "Kalyani", "Thondimuthalum Driksakshiyum", "Ennu Ninte Moideen", "Ustad Hotel", "Charlie"};
      static  String[] englishSeries = {"Friends", "Game of thrones", "Stranger Things", "Dark", "Black Mirror", "Sherlock", "Peaky Blinders", "The Witcher", "The Office", "Young Sheldon"};
    public static void main(String[] args) {
        
        System.out.println(hindiSeries[0] + " " + hindiSeries[1] + " " + hindiSeries[2] + " " + hindiSeries[3] + " " + hindiSeries[4] + " " +hindiSeries[5] + " " + hindiSeries[6] + " " + hindiSeries[7] + " " + hindiSeries[8] + " " + hindiSeries[9]);
        System.out.println(kannadaSeries[0] + " " + kannadaSeries[1] + " " + kannadaSeries[2] + " " + kannadaSeries[3] + " " + kannadaSeries[4] + " " +kannadaSeries[5] + " " + kannadaSeries[6] + " " + kannadaSeries[7] + " " + kannadaSeries[8] + " " + kannadaSeries[9]);
        System.out.println(malayalamMovies[0] + " " + malayalamMovies[1] + " " + malayalamMovies[2] + " " + malayalamMovies[3] + " " + malayalamMovies[4] + " " + malayalamMovies[5] + " " + malayalamMovies[6] + " " + malayalamMovies[7] + " " + malayalamMovies[8] + " " + malayalamMovies[9]);
      
  System.out.println(englishSeries[0] + " " + englishSeries[1] + " " + englishSeries[2] + " " + englishSeries[3] + " " + englishSeries[4] + " " +englishSeries[5] + " " + englishSeries[6] + " " + englishSeries[7] + " " + englishSeries[8] + " " + englishSeries[9]);
getHindiSeries();
getKannadaSeries();
getMalyalamiSeries();
getEnglishSeries();
     
     
    }
    public static void getHindiSeries(){
        for(String ref:hindiSeries){
        System.out.println(ref);

     }
     
    
    }
    public static void getKannadaSeries(){
        for(String ref1:kannadaSeries){
        System.out.println(ref1);

     }
     
}
public static void getMalyalamiSeries(){
        for(String ref2:malayalamMovies){
        System.out.println(ref2);

     }
}
public static void getEnglishSeries(){
        for(String ref3:englishSeries){
        System.out.println(ref3);

     }
}
     
}