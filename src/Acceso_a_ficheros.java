import javax.imageio.IIOException;
import java.io.*;

public class Acceso_a_ficheros {


    public static void main(String[] args) {
        System.out.println("Volcando a ficheros de texto: ");

        try {
            BufferedWriter ficherosSalida = new BufferedWriter(new FileWriter(new File("fichero.txt")));

            ficherosSalida.write("Hola");
            ficherosSalida.newLine();
            ficherosSalida.write("Soy");
            ficherosSalida.newLine();
            ficherosSalida.write("Youssef");
            ficherosSalida.newLine();
            ficherosSalida.close();

        }catch (IOException e){
            System.out.println(e.getMessage());

        }
    }
}
