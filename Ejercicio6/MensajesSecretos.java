import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MensajesSecretos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String archivo = "secreto.txt";

        System.out.print("Escriba un mensaje: ");
        String mensaje = entrada.nextLine();

        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo, true))) {
            escritor.write(mensaje);
            escritor.newLine();
            System.out.println("Mensaje guardado.");
        } catch (IOException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }

        int contador = 0;
        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
            String linea;
            System.out.println("\nMensajes guardados:");
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
                contador++;
            }
            System.out.println("Total de mensajes (líneas): " + contador);
        } catch (IOException e) {
            System.out.println("Error al leer: " + e.getMessage());
        }
        entrada.close();
    }
}
