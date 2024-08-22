
package com.mycompany.park;

public class Parcheggio 
{
    int num;
    
    public Parcheggio(int num)
    {
        this.num = num;
    }
    
    public void Entra()
    {
        synchronized(this)
        {
            while(num == 0)
            {
                try 
                {
                    wait();
                } 
                catch (InterruptedException ex){}
            }
            
            num--;
        }
    }
    
    public void Esce()
    {
        synchronized(this)
        {
           num++;
           notifyAll();
        } 
            
    }
        
}
