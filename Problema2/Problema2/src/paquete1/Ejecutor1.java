package paquete1;

import paquete2.Automotor;
import java.util.Scanner;

public class Ejecutor1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numIteraciones;
        String cedula;
        String marca;
        String cadena = "";
        int anioFab;
        double valorV;

        System.out.println("Cuantas iteraciones se realizara?");
        numIteraciones = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numIteraciones; i++) {
            System.out.println("Automotor " + (i + 1));
            System.out.println("Ingrese la cedula del dueño:");
            cedula = sc.nextLine();
            System.out.println("Ingrese la marca del Vehiculo:");
            marca = sc.nextLine();
            System.out.println("Ingrese el año de Fabricacion:");
            anioFab = sc.nextInt();
            System.out.println("Ingrese el valor de el Vehiculo");
            valorV = sc.nextDouble();
            sc.nextLine();
            Automotor automotor1 = new Automotor(cedula, marca, anioFab, valorV);
            automotor1.calcularValorM();
            cadena = String.format("%s\n%s", cadena, automotor1);
        }
        System.out.println(cadena);

    }

}
