import java.util.Scanner;

public class Actividad_Programacion_Basica  {
    public static void main(String[] args)  {

        Scanner scan = new Scanner(System.in);
        //Leer los numeros para realizar las operaciones:
        System.out.println("ingresa dos numeros: ");
        int num1= scan.nextInt();
        int num2= scan.nextInt();

        //Mostrar por pantalla los numeros introducidos:
        System.out.println("el primer numero introducido es: "+num1);
        System.out.println("el segundo numero introducido es: "+num2);

        // Operacion Suma:
        System.out.println("La suma de: "+num1+"+"+num2+" = "+(num1+num2));

        // Operacion Resta:
        System.out.println("La resta de: "+num1+"-"+num2+" = "+(num1-num2));

        // Operacion Producto:
        System.out.println("El producto de: "+num1+"*"+num2+" = "+(num1*num2));

        //Excetion de la division del divisor 0:
        try {
            // Operacion Division:
            System.out.println("La division de: "+num1+"/"+num2+" = "+(num1/num2));
            if (num2==0);
        }catch (Exception e){
            System.out.println("no se puede realizar la division !!! devisor = 0 !!!!");
        }

        //Inciar una array de enteros
        int array []= new  int[5];
        // El tamano de la array
        System.out.println("Los veces a introducir los numeros enteros son: "+array.length);

        //Leer los enteros
        System.out.println("---------Introducir numeros enteros ------------");

        for (int i=1; i<array.length; i++){
            System.out.println("Introduzca el numero de la posicion "+i+ " es: "+(array[i]=scan.nextInt()));

        }
        //Mostrar los numeros
        System.out.println("---------Los numeros Introducidos son------------");
        for (int i=1; i<array.length; i++){
            System.out.println("el numero introducido de la posicion "+i+" es: "+array[i]);
            System.out.println();
        }

    }
}
