import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double num1, num2, resultado;

        do {
            System.out.println("=== CALCULADORA AVANZADA ===");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz cuadrada");
            System.out.println("7. Módulo");
            System.out.println("8. Salir");
            opcion = scanner.nextInt();

            if (opcion == 8) {
                System.out.println("¡Hasta luego!");
                break;
            }

            if (opcion == 6) {
                System.out.println("Ingresa un número: ");
                num1 = scanner.nextDouble();
                if (num1 < 0) {
                    System.out.println("No se puede calcular la raíz de un número negativo");
                } else {
                    resultado = Math.sqrt(num1);
                    System.out.println("Resultado: "+ resultado);
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
                case 5:
                    resultado = Math.pow(num1, num2);
                    System.out.println("Resultado: "+ resultado);
                    break;
                case 7:
                    resultado = num1 % num2;
                    System.out.println("Resultado: "+ resultado);
                    break;
                default:
                    System.out.println("Opción no válido");
            }
        } while(true);
        
        scanner.close();
    }
}
