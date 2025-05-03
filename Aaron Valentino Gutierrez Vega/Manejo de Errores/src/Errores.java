import java.util.Scanner;



public class Errores {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese el numerador: ");
            int numerador = scanner.nextInt();

            System.out.print("Ingrese el denominador: ");
            int denominador = scanner.nextInt();

            int resultado = numerador / denominador;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division por cero.");
        } catch (Exception e) {
            System.out.println("Error: Entrada invalida.");
        }finally {
            System.out.println("Fin del programa.");
        }
        
    }
    
}