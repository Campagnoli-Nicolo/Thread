/*Un gruppo di 20 bevitori ha a disposizione una botte di vino con 3 rubinetti, contenente 100 litri di vino. Di
conseguenza possono bere solo tre persone alla volta, sempre che la botte contenga ancora vino. Si suppone per
semplicità che ogni bevuta faccia diminuire il vino nella botte di 1 litro.
Si simuli la suddetta situazione in Java, utilizzando un Monitor (costrutto synchronized di java).
Suggerimento: Il thread bevitore, dopo aver atteso un tempo casuale, deciderà di bere e si metterà in attesa se il numero
di rubinetti liberi è 0; quindi controllerà la variabile contenente il vino. Qualora non ci sia più vino il thread terminerà la
sua esecuzione). */
package com.mycompany.progvino;

public class ProgVino 
{

    public static void main(String[] args) 
    {
        for (int i = 0; i < 20; i++) 
        {
            Bevitore b = new Bevitore(i+1);
            
        }
        
    }
}
