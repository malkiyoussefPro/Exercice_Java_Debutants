import java.util.Scanner;

public class Ejemplo_While {

    public static void main(String[] args) {

        int i =0;
        //la difference entre incrementer en début et a la fin de la boucle
        System.out.println("Incrementer a la fin");
        while (i<=10){

            System.out.println(i);
            i++;
        }
        System.out.println("Incrementer au debut");
        int a=0;
        while (a<=10){
            a++;
            System.out.println(a);
        }


    }
}
