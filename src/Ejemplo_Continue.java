public class Ejemplo_Continue {

    public static void main(String[] args) {
        for (int i = 0; i<=10; i+=2){

            if (i==4)
                continue;
            System.out.println(i);
        }
    }
}
