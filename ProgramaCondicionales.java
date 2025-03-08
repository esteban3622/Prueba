import java.util.Scanner;

public class ProgramaCondicionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continuar;

        do {
            // Pedir al usuario un número
            System.out.print("Ingrese un número: ");
            int numero = sc.nextInt();

            // Verificar si el número es positivo, negativo o cero usando if-else
            if (numero > 0) {
                System.out.println("El número es positivo.");
            } else if (numero < 0) {
                System.out.println("El número es negativo.");
            } else {
                System.out.println("El número es cero.");
            }

            // Usar switch para mostrar un mensaje dependiendo del rango del número
            switch (numero) {
                case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10:
                    System.out.println("El número está en el rango de 1 a 10.");
                case 11, 12, 13, 14, 15, 16, 17, 18, 19, 20:
                    System.out.println("El número está en el rango de 11 a 20.");
                default:
                    if (numero > 20) {
                        System.out.println("El número es mayor que 20.");
                    }
            }

            // Usar un for para imprimir los primeros n números naturales
            System.out.println("Los primeros " + numero + " números naturales son:");
            for (int i = 1; i <= numero; i++) {
                System.out.print(i + " ");
            }
            System.out.println();

            // Usar un while para calcular la suma de los primeros n números naturales
            int suma = 0, contador = 1;
            while (contador <= numero) {
                suma += contador;
                contador++;
            }
            System.out.println("La suma de los primeros " + numero + " números naturales es: " + suma);

            // Usar un do-while para mostrar un mensaje de despedida y preguntar si quiere continuar
            System.out.print("¿Desea continuar? (s/n): ");
            continuar = sc.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');

        System.out.println("¡Gracias por usar el programa! Adiós.");
        sc.close();
    }
}
