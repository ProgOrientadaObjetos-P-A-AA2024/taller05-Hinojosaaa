package paquete1;
import paquete2.Calificacion;
import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ne;
        double m1, m2, m3;
        int opc;

        System.out.println("[1] Ingresar nombre, nota 1 y nota 2");
        System.out.println("[2] Ingresar nombre, nota 1, nota 2 "
                + "y nota 3");
        opc = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el nombre:");
        ne = sc.nextLine();
        System.out.println("Ingrese nota 1");
        m1 = sc.nextDouble();
        System.out.println("Ingrese nota 2");
        m2 = sc.nextDouble();
        switch (opc) {

        case 1 -> {
                Calificacion v1 = new Calificacion(ne, m1, m2);
                v1.calcularPromedio();
                System.out.printf("%s", v1);
            }
            case 2 -> {
                System.out.println("Ingrese nota 3");
                m3 = sc.nextDouble();
                Calificacion v2 = new Calificacion(ne, m1, m2, m3);
                v2.calcularPromedio();
                System.out.printf("%s", v2);
            }
            default ->
                throw new AssertionError();
        }
    }
    
}
