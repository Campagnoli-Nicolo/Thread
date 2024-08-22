
package com.mycompany.pizzeria;

public class Pizzeria 
{

    public static void main(String[] args)
    {
        Pizzaiolo p = new Pizzaiolo();
        Cliente c = new Cliente(3,p);
        
        c.start();
         
        
    }
}
