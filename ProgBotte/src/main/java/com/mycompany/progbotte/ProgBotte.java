package com.mycompany.progbotte;

public class ProgBotte 
{

    public static void main(String[] args)
    {
        for (int i = 0; i < 20; i++) 
        {
            Bevitore b = new Bevitore(i+1);
            b.start();
        }
    }
}
