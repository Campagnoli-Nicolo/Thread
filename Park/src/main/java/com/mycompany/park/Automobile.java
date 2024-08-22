package com.mycompany.park;

public class Automobile extends Thread
{
    private int num1;
    Parcheggio p;
    
    public Automobile(Parcheggio p,int num1)
    {
        this.p = p;
        this.num1 = num1;
        start();
    }
    
    @Override
    public void run()
    {
      while(true) 
      {
        try 
        { 
            sleep((int)(Math.random() * 20000));
        }
        catch(InterruptedException e){} 
        
        synchronized(p)
        {
            p.Entra();
            System.out.println(getName()+": è entrata liberi:"+p.num);
        }
        
        try 
        { 
            sleep((int)(Math.random() * 10000));
        }catch(InterruptedException e){} 
        
        synchronized(p)
        {
        p.Esce();
        System.out.println(getName()+": è uscita liberi:"+p.num);
        }
    }
}
}