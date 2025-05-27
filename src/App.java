import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double num1, num2, resultado;
        do {
            System.out.println("=== CALCULADORA BÁSICA ===");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opcion = scanner.nextInt();

            if (opcion == 5) {
                System.out.println("¡Hasta luego!");
                break;
            }

            System.out.println("Ingresa el primer número: ");
            num1= scanner.nextDouble();
            
            System.out.println("Ingresa el segundo número: ");
            num2 = scanner.nextDouble();

            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("Resultado: "+ resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("Resultado: "+ resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("Resultado: "+ resultado);
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("No se puede dividir entre cero");
                    } else {
                        resultado = num1 / num2;
                        System.out.println("Resultado: "+ resultado);
                    }
                    break;
                default:
                    System.out.println("Opción no válido");
            }
        } while(opcion != 5);
        
        scanner.close();
    }
}
