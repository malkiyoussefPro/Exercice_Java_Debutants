public class Ejemplo_Do_While {

    public static void main(String[] args) {
       //seulement pour tester que a boucle do while execute au moins une fois meme si la condition est fausse
        int i = 20;

        do {
            i++;
            System.out.println(i);
        }while (i<=10);
    }
}
