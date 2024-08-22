package com.mycompany.progvino;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Bevitore extends Thread
{
    Botte b2 = new Botte(3);
    int num2;
    
    public Bevitore(int num2)
    {
        this.num2 = num2;
        start();
    }
    
    @Override
    public void run()
    {
        synchronized(b2)
        {
             try {
            b2.Bevi(num2);
        } catch (InterruptedException ex) {
            Logger.getLogger(Bevitore.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
       
           synchronized(b2)
           {
               b2.Stacca(num2);
           }
        
            
    }
}
