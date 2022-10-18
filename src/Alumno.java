
import java.util.Scanner;

public class Alumno {

    //Declaracion de los variables
    private String Nombre;
    private String Apellido;
    private int edad;

    static int numeroAlumnos;

    //Constructor por defecto
    public Alumno(){

    }
    //Constructor con parametros
    public Alumno(String nombre, String apellido, int edad) {
        Nombre = nombre;
        Apellido = apellido;
        this.edad = edad;
    }
    //Los Getters y Setters
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Metodo para rellenar el Array de los Alumnos
    public void RellenarArray(){
        Scanner scan =new Scanner(System.in);
        System.out.print("Indica el numero de los alumnos: ");
        numeroAlumnos = scan.nextInt();
        Alumno [] alumno =new Alumno[numeroAlumnos];
        for (int i=1; i<=alumno.length; i++ ){
            System.out.println("Ingresa el Nombre del alumno: ");
            Nombre= scan.next();
            System.out.println("Ingresa el apellido del alumno: ");
            Apellido= scan.next();
            System.out.println("Ingresa la edad del alumno: ");
            edad= scan.nextInt();
        }
    }
    //Metodo para mostrar el Array de los Alumnos
    public void MostrarArrays(){
       for (int i=1; i<=numeroAlumnos; i++){
            System.out.println("* Los datos del alumno N: "+i);
           System.out.println("- El nombre es: "+getNombre()+"\n"+"- El apellido es: "+getApellido()+"\n"+"- La edad es: "+getEdad()+" ans.");

       }
    }

    public static void main(String[] args) {

        // Creacion del objeto alumno
        Alumno alumno = new Alumno();

        // LLamar al metodo creado para rellenar el array de los alumnos
        alumno.RellenarArray();

        // LLamar al metodo creado para mostrar el array de los alumnos
        alumno.MostrarArrays();

        //Fin de programa
        System.out.println("Fin de programa.");

    }


}
