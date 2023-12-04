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

      Scanner po=new Scanner(System.in);

      int modifica;
      int posizione;
        System.out.println("dimmi un numero che vuoi modificare: ");
        modifica=po.nextInt();
        po.nextLine();
        System.out.println("la sua posizione");
        posizione=po.nextInt();
        po.nextLine();

        ar[posizione]=modifica;
        po.nextLine();



      try {
          for (int i=0;i<ar.length;i++){
              System.out.println(ar[i]);

          }
      }catch (Exception ex){
          System.err.println(ex.getMessage());
      }







        po.close();






        return ar;
    }







}