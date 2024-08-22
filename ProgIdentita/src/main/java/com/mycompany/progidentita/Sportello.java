package com.mycompany.progidentita;

public class Sportello 
{
    static int num;
    
    public static int getNum()
    {
        return num;
    }
    
    public void Richiesta() throws InterruptedException
    {
        synchronized(this)
        {
            while(num==0)
            {
                wait();
            } 
            
            num--;
        }
    }
    
    public void Stampa()
    {
        synchronized(this)
        {
            num++;
            notifyAll();
        }
        
        
    }
}
