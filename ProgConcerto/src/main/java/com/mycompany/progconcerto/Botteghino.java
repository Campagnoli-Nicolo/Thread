package com.mycompany.progconcerto;

public class Botteghino 
{
    int num;
    
    public Botteghino(int num)
    {
        this.num = num;
    }
    
    public synchronized void Compra(int num2) throws InterruptedException
    {
        while(num==0)
        {
            wait(((int)Math.random()+1)*50000);
        }
        
        num--;
        System.out.println("Il turista numero: " + num2 + " ha comprato il biglietto ");
    }
    
    public synchronized void Finita()
    {
            
            System.out.println("Il concerto e' finito il turista sta uscendo");
            num++;
            notifyAll();
        
        
        
    }
}
