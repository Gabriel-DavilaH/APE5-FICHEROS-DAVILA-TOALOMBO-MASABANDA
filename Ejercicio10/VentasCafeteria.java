import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class VentasCafeteria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String archivo = "ventas.txt";

        System.out.print("Nombre del producto: ");
        String producto = entrada.nextLine();

        System.out.print("Precio: ");
        String textoPrecio = entrada.nextLine();

        try {
            double precio = Double.parseDouble(textoPrecio.trim());
            if (precio < 0) {
                System.out.println("El precio no puede ser negativo.");
                entrada.close();
                return;
            }

            try (BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo, true))) {
                escritor.write(producto + "," + precio);
                escritor.newLine();
                System.out.println("Venta registrada.");
            }
        } catch (NumberFormatException e) {
            System.out.println("El precio debe ser numérico.");
            entrada.close();
            return;
        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }

        System.out.print("Mostrar productos con precio superior a: ");
        double limite;
        try {
            limite = Double.parseDouble(entrada.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Valor límite no válido.");
            entrada.close();
            return;
        }

        double total = 0;
        double mayor = Double.NEGATIVE_INFINITY;
        String productoMayor = "";
        int cantidad = 0;

        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
            String linea;
            System.out.println("\nVentas registradas:");
            while ((linea = lector.readLine()) != null) {
                String[] datos = linea.split(",", 2);
                if (datos.length != 2) {
                    System.out.println("Registro incorrecto: " + linea);
                    continue;
                }

                try {
                    String nombre = datos[0].trim();
                    double precio = Double.parseDouble(datos[1].trim());
                    System.out.println(nombre + " - $" + precio);
                    total += precio;
                    cantidad++;

                    if (precio > mayor) {
                        mayor = precio;
                        productoMayor = nombre;
                    }
                    if (precio > limite) {
                        System.out.println("Supera el valor indicado: " + nombre);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Precio incorrecto: " + linea);
                }
            }

            System.out.println("Total de ventas: $" + total);
            if (cantidad > 0) {
                System.out.println("Producto de mayor precio: " + productoMayor + " ($" + mayor + ")");
            } else {
                System.out.println("No hay ventas válidas.");
            }
        } catch (IOException e) {
            System.out.println("Error al leer: " + e.getMessage());
        }
        entrada.close();
    }
}
