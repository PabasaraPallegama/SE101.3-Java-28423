package com.mycompany.trafficlightobj;
public class RedLightThread extends Thread
{
    public void run()
    {
        
        
        {
            try
            {
                while(true)
                { System.out.println("Red Light");
                Thread.sleep(5000);}
            }
            catch(InterruptedException e)
                    {
                        System.out.println(e.getMessage());
                    }
            
        }
    }
}
