
package com.mycompany.progconcerto;

public class Turisti extends Thread
{
    int num;
    Botteghino b = new Botteghino(5);
    
    public Turisti(int num)
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
                b.Compra(num);
            } catch (InterruptedException ex) {}
        }
        
        synchronized(b)
        {
            b.Finita();
        }
    }
}
