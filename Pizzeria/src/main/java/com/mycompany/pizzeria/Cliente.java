package com.mycompany.pizzeria;

public class Cliente extends Thread
{
    int numClienti;
    Pizzaiolo p;
    
    public Cliente(int numClienti,Pizzaiolo p)
    {
        this.numClienti = numClienti;
        this.p = p;
    }
    
    private void Mangia()
    {
        synchronized(p)
        {
           
                System.out.println("(Cliente) " + " Gnam....Gnam...");
            
        }
        
    }
    
    @Override
    public void run()
    {
        for (int i = 1; i <= numClienti; i++)
        { 
             p.Cottura();
             Mangia(); 
        }
       
    }
}
