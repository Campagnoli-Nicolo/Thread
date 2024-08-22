
package com.mycompany.progcomune;

public class Sportello 
{
    public void Compilazione(int num) throws InterruptedException
    {
        synchronized(this)
        {
            System.out.println("Il richiedente numero: " + num + " ha chiesto un modulo");
            System.out.println("Il richiedente numero: " + num + " sta compilando");
            Thread.sleep(((int)Math.random()+1)*10000);
            System.out.println("il modulo del richiedente numero: " + num + " si sta stampando");
            Thread.sleep(3000);
            System.out.println("il modulo del richiedente numero: " + num + " e' stato stampato");
        }
        
    }
}
