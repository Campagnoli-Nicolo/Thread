package com.mycompany.progvino;

public class Botte 
{
    int rubinetti,litri;
    
    public Botte(int rubinetti)
    {
        this.rubinetti = rubinetti;
    }
    
    public synchronized void Bevi(int num2) throws InterruptedException
    {
                  
        while(rubinetti==0)
        {
            wait((int) ((Math.random() + 1) * 20000));
        }   
        
        System.out.println("Il bevitore numero " + num2 + " sta bevendo da un rubinetto");  
        rubinetti--;
    }
    
    public synchronized void Stacca(int num2)
    {
        System.out.println("Il bevitore numero " + num2 + " ha smesso di bere e sono rimasti " + litri + " litri");
        rubinetti++;
        notifyAll();
    }
}
