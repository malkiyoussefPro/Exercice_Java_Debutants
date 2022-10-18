import java.util.Scanner;

public class Racional {
    //Inicializar la clase Scanner
    static Scanner scan = new Scanner(System.in);
    //Declaracion de los variables
    private int numerador;
    private int denominador;


    //Constructor sin parametros
    public Racional() {
    }

    //Constructor con parametros
    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    // Metodo Setters del variable numerador
    public void Setnumerador(int num){
        this.numerador=num;
    }
    // Metodo Setters del variable denominador
    public void Setdenominador(int den){
        this.denominador=den;
    }

    //Metodo Getters del variable numerador
    public int getnumerador(){
        return numerador;
    }

    // Metodo Getters del variable denominador
    public int getdenominador(){
        return denominador;
    }

    //función crear nuevo objeto racional
    public void Crear_Racional(){
        Racional racional = new Racional();
    }
    //función mostrar objeto racional por pantalla.
    public void Mostrar_racional(){
        System.out.println("***** Funcion mostrar por pantalla Sin Parametro *****");
        this.numerador=2;
        this.denominador=3;
        System.out.println("El numerador 'Funcion mostrar por pantalla Sin Parametro' es :"+getnumerador());
        System.out.println("El denominador 'Funcion mostrar por pantalla Sin Parametro' es :"+getdenominador());
    }
    public void Mostrar_racional(int num, int den){
        System.out.println("***** Funcion mostrar por pantalla Con Parametro *****");
        this.numerador=num;
        this.denominador=den;
        System.out.println("El numerador 'Funcion mostrar por pantalla Con Parametro' es :"+getnumerador());
        System.out.println("El denominador 'Funcion mostrar por pantalla Con Parametro' es :"+getdenominador());
    }
    //Metodo de oprecacion de suma
    public int Sumar_Racionales(){
        System.out.println("***** Funcion de Suma *****");
        System.out.print("Ingresa el numerador: ");
    this.numerador=scan.nextInt();
        System.out.print("Ingresa el denominador: ");
    this.denominador=scan.nextInt();

        try {
            if(this.getdenominador() == 0);
            System.out.println("El Producto de " + this.getnumerador() + " + " + this.getdenominador() + " = " + (this.getnumerador()  + this.getdenominador()));
        } catch (Exception e) {
            System.out.println("!!!Error el denominador debe tener valor diferente de 0");
        }
        return (this.getnumerador()  + this.getdenominador());
    }
    //Metodo de oprecacion de multiplicacion
   public int Multiplicar_Racionales() {
       System.out.println("***** Funcion de Multiplicacion *****");
        System.out.print("Ingresa el numerador: ");
        numerador = scan.nextInt();
       System.out.print("Ingresa el denominador: ");
       denominador = scan.nextInt();
       try {
           System.out.println("El Producto de " + numerador + " * " + denominador + " = " + (this.getnumerador()  * this.getdenominador()));        if(denominador == 0);
           if(getdenominador() == 0);
       } catch (Exception e) {
          System.out.println("!!!Error el denominador debe tener valor diferente de 0");
       }
       return (this.getnumerador()  * this.getdenominador());
  }

    public static void main(String[] args) {
        //Cracion de objeto sin parametro
        Racional racional = new Racional();

        //Llamar a los metodos
        racional.Mostrar_racional();
        racional.Sumar_Racionales();
        racional.Multiplicar_Racionales();

        //Cracion de objeto con parametro
        Racional racional2 =new Racional(8,97);
        System.out.println("El numerador del objeto con parametro es :"+racional2.getnumerador());
        System.out.println("El denominador del objeto con parametro es :"+racional2.getdenominador());

        //uso del metodo con Mostrar_racional con parametros
        racional2.Mostrar_racional(5,51);

    }
}