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

            System.out.println(ar[2]);//stampa valori;
            Scanner num=new Scanner(System.in);


          try {
              System.out.println("dimmi un numero da posizionare nell'array(specifica anche dove): ");
              num.nextLine();
          }catch (Exception exception){
              System.out.println("errore nella scelta del numero");
              num.nextLine();
          }finally {
              num.close();
          }






         return ar;
     }

}