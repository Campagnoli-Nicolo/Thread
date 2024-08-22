
package com.mycompany.park;

public class Park
{
    
    public static void main(String[] args) 
    {
        
        Parcheggio p = new Parcheggio(5);
        
        for (int i = 1; i <= 10; i++) 
        {
            Automobile a = new Automobile(p,i);
        }
       
        
    }

}
