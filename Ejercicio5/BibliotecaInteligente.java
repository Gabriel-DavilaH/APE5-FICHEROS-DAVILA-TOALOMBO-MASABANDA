import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BibliotecaInteligente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String archivo = "libros.txt";

        System.out.print("Ingrese el título del nuevo libro: ");
        String nuevoLibro = entrada.nextLine();

        try (FileWriter escritor = new FileWriter(archivo, true)) {
            escritor.write(nuevoLibro + System.lineSeparator());
            System.out.println("Libro registrado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al registrar el libro: " + e.getMessage());
        }

        File fichero = new File(archivo);
        if (!fichero.exists()) {
            System.out.println("El archivo no existe.");
            entrada.close();
            return;
        }

        System.out.print("Ingrese el título que desea buscar: ");
        String buscado = entrada.nextLine();
        int contador = 0;
        boolean encontrado = false;

        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
            String linea;
            System.out.println("\nLibros registrados:");
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
                contador++;
                if (linea.equalsIgnoreCase(buscado)) {
                    encontrado = true;
                }
            }

            System.out.println("Cantidad de libros: " + contador);
            System.out.println(encontrado ? "Libro encontrado." : "Libro no encontrado.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        entrada.close();
    }
}
