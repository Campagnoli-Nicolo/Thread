package com.mycompany.progvisita;

public class Visitatore extends Thread
{
    int num;
    
    Sportello s = new Sportello(5); 
    
    public Visitatore(int num)
    {
        this.num = num;
    }

    @Override
    public void run()
    {
           synchronized(s)
           {
                try 
                {
                    s.Entra(num);
                } catch (InterruptedException ex) {}
           }
            
           synchronized(s)
           {
             s.Esci(); 
           }
                      
        
    }
}
