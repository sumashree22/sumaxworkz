public class Speaker {
        static boolean isConnected=false;
       static int currentVolume=0;
      
    
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
    
            public static void increaseVolume()
    
            {
                int maxVolume=5;
                if(isConnected==true){
                    if(currentVolume<maxVolume)
               { 
                currentVolume=currentVolume+1;
                System.out.println("current speed is "+currentVolume);
            }
                else
               System.out.println(" max speed reached ");
        }
        else{
        System.out.println("turn on the speaker");
        return ;
    }    } 
        
    
    
    public static void decreaseVolume()
            {
                int minVolume=0;
                if(isConnected==true){
                    if(currentVolume>minVolume)
               { 
                currentVolume=currentVolume-1;
                System.out.println("current temp is "+currentVolume);
            }
                else
               System.out.println(" min temp reached ");
        }
        else{
        System.out.println("turn on the speaker");
        return ;
          
            }
        
            
            }
        
    }