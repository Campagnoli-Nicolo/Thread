package com.mycompany.progbotte;

public class Botte 
{
    int num;
    
    public Botte(int num)
    {
        this.num = num;
    }
    
    public synchronized void Bevi(int num2) throws InterruptedException
    {
        while(num==0)
        {
            wait(((int)Math.random()+1)*20000);
        }
        
        num--;
        System.out.println("Il bevitore numero " + num2 + " sta bevendo");
    }
    
    public synchronized void Smetti() throws InterruptedException
    {
        System.out.println("Il bevitore sta bevendo");
        System.out.println("Il bevitore ha smesso di bere");
        num++;
        notifyAll();
    }
}
