package com.mycompany.trafficlightobj;
public class GreenLightThread extends Thread
{
    public void run()
    {
        
        
        {
            try
            {
                while(true){
                    System.out.println("Green Light");
                Thread.sleep(10000);}
            }
            catch(InterruptedException e)
                    {
                        System.out.println(e.getMessage());
                    }
            
        }
    }
}
