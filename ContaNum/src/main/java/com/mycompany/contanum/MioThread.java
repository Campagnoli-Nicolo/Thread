
package com.mycompany.contanum;

public class MioThread extends Thread
{
    int num;
    String nome;
    
    public MioThread(String nome,int num)
    {
        this.nome = nome;
        this.num = num;
    }
    
    
    public void Conta10()
    {
        synchronized(this)
        {
            for (int i = 1; i <= num; i++) 
            {
                System.out.println("Thread " + nome + " sta stampando: " + i);
            }
        }
    }
    
    @Override
    public void run()
    {
        Conta10();
        try 
        {
            sleep(2000);
        } 
        catch (InterruptedException ex){}
    }
}
