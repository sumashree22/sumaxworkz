class MaharajaMenu {
    static String[] breakfast = { "Eggs", "Toast", "Omelette", "Fruit Salad", "Yogurt"};
       static  String[] lunch = {"Pasta", "Burger", "Salad", "Sushi", "Pizza", "Sandwich", "Grilled Cheese", "Soup"};
       static String[] dinner = {"Spaghetti", "Fish", "Chicken", "Burger", "Pizza", "Sushi", "Salad"};
    public static void main(String[] args) {
        
        System.out.println(breakfast[0] + " " + breakfast[1] + " " + breakfast[2] + " " + breakfast[3] + " " + breakfast[4] );
        System.out.println(lunch[0] + " " + lunch[1] + " " + lunch[2] + " " + lunch[3] + " " + lunch[4] + " " +lunch[5] + " " + lunch[6] + " " + lunch[7] );
        System.out.println(dinner[0] + " " + dinner[1] + " "+dinner[2]+" "+dinner[3]+" "+ dinner[4] + " " + dinner[5] +" "+dinner[6]);
        getBreakfast();
        getLunch();
        getDinner();

    }
     public static void getBreakfast(){
        for(String reference:breakfast){
            System.out.print( "  "+reference);
        }
    }
     public static void getLunch(){
        for(String reference2:lunch){
            System.out.print( "  "+reference2);
        }
    }
     public static void getDinner(){
        for(String reference3:dinner){
            System.out.print( "  "+reference3);
        }
    }
    
    }