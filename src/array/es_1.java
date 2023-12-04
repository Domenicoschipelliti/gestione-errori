package array;

import java.util.Scanner;

public class es_1  {
    public int numeri=(int)(Math.random()*10+1);
   public int[] ar=new int[5];//dichiarazione e fissazione di un array;



    public  int[] ray(){

        ar[0]=numeri;
        ar[1]=numeri;
        ar[2]=numeri;
        ar[3]=numeri;
        ar[4]=numeri;


      for (int i=0;i<ar.length;i++){
          System.out.println(ar[i]);

      }



        return ar;
    }







}