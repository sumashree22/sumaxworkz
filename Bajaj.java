public class Bajaj {
        static boolean isConnected=false;
       static int currentSpeed=0;
      
    
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
    
            public static void increaseSpeed()
    
            {
                int maxSpeed=5;
                if(isConnected==true){
                    if(currentSpeed<maxSpeed)
               { 
                currentSpeed=currentSpeed+1;
                System.out.println("current speed is "+currentSpeed);
            }
                else
               System.out.println(" max speed reached ");
        }
        else{
        System.out.println("turn on the fan");
        return ;
    }    } 
        
    
    
    public static void decreaseSpeed()
            {
                int minSpeed=0;
                if(isConnected==true){
                    if(currentSpeed>minSpeed)
               { 
                currentSpeed=currentSpeed-1;
                System.out.println("current temp is "+currentSpeed);
            }
                else
               System.out.println(" min temp reached ");
        }
        else{
        System.out.println("turn on the fan");
        return ;
          
            }
        
            
            }
        
    }