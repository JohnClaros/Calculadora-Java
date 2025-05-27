import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> historial = new ArrayList<>();
        int opcion;
        double num1, num2, resultado;
        String archivo = "historial.txt";

        do {
            System.out.println("=== CALCULADORA CON HISTORIAL EN ARCHIVO ===");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz cuadrada");
            System.out.println("7. Módulo");
            System.out.println("8. Historial");
            System.out.println("9. Salir");
            System.out.println("Elige una opción: ");
            opcion = scanner.nextInt();

            if (opcion == 9) {
                System.out.println("¡Hasta luego!");
                break;
            }

            if (opcion == 8) {
                System.out.println("\n--- Historial de operaciones---");
                if (historial.isEmpty()) {
                    System.out.println("Aún no hay operaciones registradas");
                } else {
                    for (String h : historial) {
                        System.out.println(h);
                    }
                }
                continue;
            }

            if (opcion == 6) {
                System.out.println("Ingresa un número: ");
                num1 = scanner.nextDouble();
                if (num1 < 0) {
                    System.out.println("No se puede calcular la raíz de un número negativo");
                } else {
                    resultado = Math.sqrt(num1);
                    String operacion = "√" + num1 + " = " +resultado;
                    System.out.println("Resultado: "+ resultado);
                    historial.add(operacion);
                    guardarEnArchivo(archivo, operacion);
                }
                continue;
            }

            System.out.println("Ingresa el primer número: ");
            num1= scanner.nextDouble();
            System.out.println("Ingresa el segundo número: ");
            num2 = scanner.nextDouble();

            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("Resultado: "+ resultado);
                    historial.add(num1 + " + " + num2 + " = " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("Resultado: "+ resultado);
                    historial.add(num1 + " - " + num2 + " = " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("Resultado: "+ resultado);
                    historial.add(num1 + " * " + num2 + " = " + resultado);
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("No se puede dividir entre cero");
                    } else {
                        resultado = num1 / num2;
                        System.out.println("Resultado: "+ resultado);
                        historial.add(num1 + " / " + num2 + " = " + resultado);
                    }
                    break;
                case 5:
                    resultado = Math.pow(num1, num2);
                    System.out.println("Resultado: "+ resultado);
                    historial.add(num1 + " ^ " + num2 + " = " + resultado);
                    break;
                case 7:
                    resultado = num1 % num2;
                    System.out.println("Resultado: "+ resultado);
                    historial.add(num1 + " % " + num2 + " = " + resultado);
                    break;
                default:
                    System.out.println("Opción no válido");
            }

        } while(true);
        
        scanner.close();
    }

    private static void guardarEnArchivo(String archivo, String texto) {
        try (FileWriter writer = new FileWriter(archivo, true)){
            writer.write(texto + "\n");
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: "+ e.getMessage());
        }
    }
}
