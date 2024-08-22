/* Un gruppo di 50 turisti si recano a visitare il Louvre per vedere la Gioconda. Per motivi di sicurezza possono entrare
nel museo solo 5 persone alla volta.
Simulare la suddetta situazione in Java, utilizzando utilizzando un Monitor (costrutto synchronized di java). Ogni turista
sarà rappresentato da un Thread; i turisti attenderanno un tempo casuale, quindi cercheranno di entrare nel museo, di
vedere il quadro e alla fine usciranno dal museo.
Si deve utilizzare un Monitor per gestire i vincoli sulla mutua esclusione e sugli accessi limitati*/

package com.mycompany.progmuseo;

public class ProgMuseo 
{
    public static void main(String[] args) 
    {
        for (int i = 0; i < 50; i++) 
        {
            Turista t = new Turista(i+1);
            t.start();
        }
    }
}
