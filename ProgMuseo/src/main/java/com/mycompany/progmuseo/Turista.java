package com.mycompany.progmuseo;

public class Turista extends Thread
{
    Museo m = new Museo(5);
    int num;
    public Turista(int num)
    {
        this.num = num;
    }
    
   @Override
   public void run()
   {
       synchronized(m)
       {
           try 
           {
               m.Entra(num);
           }catch(InterruptedException ex){}
          
       }
       
       synchronized(m)
       {
           try 
            {
                m.Esce();
            } 
            catch(InterruptedException ex){} 
       }
       
   }
}
