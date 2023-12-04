package calcolo;

import java.util.Scanner;

public class Es_2 {


    Scanner l=new Scanner(System.in);

    int kilometri;
    int litri;

    int risultato;
    public int cal(){


            System.out.println("dammi i kilometri fatti:");
            kilometri=l.nextInt();
            l.nextLine();
            System.out.println("litri");
            litri=l.nextInt();
            l.nextLine();
            risultato=kilometri/litri;



        try {
            if (kilometri>0 && litri>0){
                System.out.println("tutto corretto");
                System.out.println("risultato " + risultato);//se va tutto bene verrò stampato sulla console la divisione
            }
        }catch (Exception ex){
            System.err.println(ex.getMessage());
        }finally {//finally quando si vuole una azione vada lo stesso eseguita indipendetemente dal risoltato;
            l.close();
        }
        return risultato;

    }
}
