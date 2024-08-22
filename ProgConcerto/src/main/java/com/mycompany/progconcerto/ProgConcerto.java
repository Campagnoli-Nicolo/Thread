package com.mycompany.progconcerto;

public class ProgConcerto 
{

    public static void main(String[] args) 
    {
        for (int i = 0; i < 200; i++) 
        {
            Turisti t = new Turisti(i+1);
            t.start();
            
        }
    }
}
