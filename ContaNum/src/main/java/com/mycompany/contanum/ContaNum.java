
package com.mycompany.contanum;

public class ContaNum 
{
    public static void main(String[] args) 
    {
        MioThread m1 = new MioThread("uno",10);
        MioThread m2 = new MioThread("due",50);
        
        m1.start();
        m2.start();
    }
}
