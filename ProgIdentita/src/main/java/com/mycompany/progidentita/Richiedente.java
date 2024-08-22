package com.mycompany.progidentita;

public class Richiedente extends Thread
{
    Sportello s = new Sportello();
    int num;
    
    public Richiedente(int num)
    {
        this.num = num;
    }
    
    @Override
    public void run()
    {
       
        
            System.out.println("Il richiedente numero " + num + " richiede il modulo");
            try 
            {
                s.Richiesta();
            } catch (InterruptedException ex) {}
        
        
        
            System.out.println("Il richiedente numero " + num + " ha finito di compilare il modulo");
            s.Stampa();
            System.out.println("Il modulo del richiedente " + num + " e' stato stampato");  
        
        
        
    }
}
