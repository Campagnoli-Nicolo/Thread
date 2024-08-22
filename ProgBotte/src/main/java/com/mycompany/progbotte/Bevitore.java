package com.mycompany.progbotte;

public class Bevitore extends Thread
{
    int num;
    Botte b = new Botte(3);
    
    public Bevitore(int num)
    {
        this.num = num;
    }
    
    @Override
    public void run()
    {
        synchronized(b)
        {
            try 
            {
                b.Bevi(num);
            } catch (InterruptedException ex) {}
        }
        
        synchronized(b)
        {
            try 
            {
            b.Smetti();
            } catch (InterruptedException ex) {}  
        }
        
    }
}
