import java.util.Scanner;

public class EjercicioTaxi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String tarifaDiaNoche = "";
        double distancia = 0.0;
        double totalPasaje = 0.0;
        final double tarifaBase = 2.50;
        final double kilometroNormal = 1.00;
        final double kilometroAdicional = 0.75;

        System.out.print("Ingrese la distancia total recorrida: ");
        distancia = sc.nextDouble();

        System.out.print("El servicio fue Día (S) / Noche (N) ");
        tarifaDiaNoche = sc.next();

        if (distancia < 10) {
            totalPasaje = distancia*kilometroNormal + tarifaBase;
        } else {
            totalPasaje = 10*kilometroNormal + (distancia - 10)*kilometroAdicional + tarifaBase;
        }

        if (tarifaDiaNoche.equals("N")) {
            totalPasaje = totalPasaje*1.1;
        } 

        System.out.println("La tarifa total es: "+ totalPasaje);
        sc.close();
    }
}