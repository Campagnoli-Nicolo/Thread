package com.mycompany.progvisita;

public class ProgVisita 
{

    public static void main(String[] args) 
    {
        for (int i = 0; i < 50; i++)
        {
            Visitatore v = new Visitatore((i+1));
            v.start();
        }
    }
}
