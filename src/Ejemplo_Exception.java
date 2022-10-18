public class Ejemplo_Exception {

    public static void main(String[] args) {
        int num1=5;
        int num2=0;

        int tab[]= {1,2,3,4,5,6};

        try {
            System.out.println(tab[10]);
        }catch (Exception e){
            System.out.println("attention !!! une erreur sur la taille du tableau");
        }
        try {
            System.out.println("La division de: "+num1+"/"+num2+" = "+(num1/num2));
            num2=0;
        }catch (ArithmeticException e){
            System.out.println("no se puede realizar la division !!! devisor = 0 !!!!");
        }

    }
}
