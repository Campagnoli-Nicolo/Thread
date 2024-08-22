
package com.mycompany.pizzeria;

public class Pizzaiolo
{
    int num;

    public void Cottura()
    {
        synchronized(this)
        {
            System.out.println("(Pizzaiolo) Pizza in cottura");
            try 
            {
                Thread.sleep(2000);
            }catch (InterruptedException ex){}
             
            System.out.println("(Pizzaiolo) Pizza pronta");
            
            try
            {
                Thread.sleep(5000);
            }catch (InterruptedException ex){}
        }
    
    }
    
}
