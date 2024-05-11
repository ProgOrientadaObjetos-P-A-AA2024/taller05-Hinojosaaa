package paquete1;

import paquete2.Automotor;
import java.util.Scanner;

public class Ejecutor2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cedula;
        String marca;
        String cadena = "";
        int anioFab;
        double valorV;
        boolean bandera = true;
        String status;
        int opc = 1;
        while (bandera) {
            System.out.println("Automotor " + (opc));
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
            System.out.println("Ingrese [exit] para salir del ciclo");
            status = sc.nextLine();
            opc++;
            if (status.equals("exit")) {
                bandera = false;
            }
        }
        System.out.println(cadena);

    }

}
