import java.util.Scanner;

public class Ejemplo_For {

    public static void main(String[] args) {

        System.out.println("entrer un numero");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        for (int i =0; i<=numero; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
