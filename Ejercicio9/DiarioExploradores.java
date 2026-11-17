import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DiarioExploradores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String archivo = "descubrimientos.txt";

        System.out.print("Ingrese un nuevo descubrimiento: ");
        String nuevo = entrada.nextLine();

        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo, true))) {
            escritor.write(nuevo);
            escritor.newLine();
            System.out.println("Descubrimiento guardado.");
        } catch (IOException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }

        File fichero = new File(archivo);
        if (!fichero.exists() || fichero.length() == 0) {
            System.out.println("El archivo no existe o está vacío.");
            entrada.close();
            return;
        }

        System.out.print("¿Qué descubrimiento desea buscar? ");
        String buscado = entrada.nextLine();
        int contador = 0;
        boolean encontrado = false;

        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
            String linea;
            System.out.println("\nDescubrimientos:");
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
                contador++;
                if (linea.equalsIgnoreCase(buscado)) {
                    encontrado = true;
                }
            }
            System.out.println("Total de descubrimientos: " + contador);
            System.out.println(encontrado ? "Descubrimiento encontrado." : "No se encontró el descubrimiento.");
        } catch (IOException e) {
            System.out.println("Error al leer: " + e.getMessage());
        }
        entrada.close();
    }
}
