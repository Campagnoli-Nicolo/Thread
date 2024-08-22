package com.mycompany.progcomune;

public class ProgComune 
{

    public static void main(String[] args) 
    {
        for (int i = 0; i < 10; i++)
        {
            Richiedente r = new Richiedente((i+1));
            r.start();
        }
       
    }
}
