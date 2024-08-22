package com.mycompany.progvisita;

public class Sportello 
{
    int num;
    
    public Sportello(int num)
    {
        this.num = num;
    }
    
    public synchronized void Entra(int num2) throws InterruptedException
    {
 
            while(num==0)
            {
                wait((int) ((Math.random() + 1) * 10000));
            }
            
            num--;
            System.out.println("Il visitatore numero: " + num2 + " sta entrando");
    }
    
    public synchronized void Esci()
    {
            System.out.println("Il visitatore sta guardando la gioconda");
            System.out.println("Il visitatore e' uscito");
            num++;
            notifyAll();
       
        
    }
}
