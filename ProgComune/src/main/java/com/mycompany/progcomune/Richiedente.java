package com.mycompany.progcomune;

public class Richiedente extends Thread
{
    int num;
    Sportello s = new Sportello();
    public Richiedente(int num)
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
                s.Compilazione(num);
            } catch(InterruptedException ex){}
        }
    }
}
