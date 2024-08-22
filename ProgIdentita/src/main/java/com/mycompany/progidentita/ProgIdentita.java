package com.mycompany.progidentita;

public class ProgIdentita {

    public static void main(String[] args) 
    {
        for (int i = 0; i < 20; i++) 
        {
            Richiedente r = new Richiedente(i+1);
            r.start();
        }
        
    }
}
