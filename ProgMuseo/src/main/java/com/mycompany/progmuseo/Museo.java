
package com.mycompany.progmuseo;

public class Museo 
{
    int num;
    
    public Museo(int num)
    {
        this.num = num;
    }
    
    public synchronized void Entra(int num2) throws InterruptedException
    {
        while(num==0)
        {
            wait(((int)Math.random()+1)*20000);
        }
        num--;
        System.out.println("Il turista numero " + num2 + " e' entrato");
    }
    
    public synchronized void Esce() throws InterruptedException
    {
        System.out.println("Il turista sta visitando Louvre");
        System.out.println("Il turista e' uscito");
        num++;
        notifyAll();
    }
}
