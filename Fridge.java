public class Fridge{
        static boolean isConnected=false;
       static int currentTemp=0;
       public static void onOrOff()
        {
             if(isConnected==false)
             {
               System.out.println("fan is connected");
                isConnected=true;
            }
            else{
                System.out.println("fan is not connected");
             isConnected=false;
            }}
    
            public static void incTemp()
    
            {
                int maxTemp=5;
                if(isConnected==true){
                    if(currentTemp<maxTemp)
               { 
                currentTemp=currentTemp+1;
                System.out.println("current speed is "+currentTemp);
            }
                else
               System.out.println(" max speed reached ");
        }
        else{
        System.out.println("turn on the fridge");
        return ;
    }    } 
        
    
    
    public static void decTemp()
    {
        int minTemp=0;
        if(isConnected==true){
        if(currentTemp>minTemp)
               { 
                currentTemp=currentTemp-1;
                System.out.println("current temp is "+currentTemp);
            }
                else
               System.out.println(" min temp reached ");
        }
        else{
        System.out.println("turn on the Fridge");
        return ;
          
            }
 }
        
    
}