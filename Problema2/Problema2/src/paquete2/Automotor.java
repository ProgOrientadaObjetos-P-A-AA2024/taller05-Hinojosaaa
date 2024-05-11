package paquete2;

public class Automotor {

    private String cedula;
    private String marca;
    private int anioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    public Automotor(String c, String m, int a, double vv) {
        cedula = c;
        marca = m;
        anioFabricacion = a;
        valorVehiculo = vv;
    }

    public void establecerCedula(String x) {
        cedula = x;
    }

    public void establecerMarca(String x) {
        marca = x;
    }

    public void establecerAnio(int n) {
        anioFabricacion = n;
    }

    public void establecerValorV(double n) {
        valorVehiculo = n;
    }

    public void calcularValorM() {
        valorMatricula = ((valorVehiculo * 0.02) / 100) * (2024 - anioFabricacion);
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerMarca() {
        return marca;
    }

    public int obtenerAnio() {
        return anioFabricacion;
    }

    public double obtenerValorV() {
        return valorVehiculo;
    }

    public double obtenerValor() {
        return valorMatricula;
    }

    public String toString() {
        String cadena = String.format("Automotor\n"
                + "Cedula: %s\n"
                + "Marca del Vehiculo: %s\n"
                + "Año de Fabricación del Vehiculo: %d\n"
                + "Valor del Vehiculo: %.2f\n"
                + "Valor de la Matricula: %.2f\n",
                obtenerCedula(),
                obtenerMarca(),
                obtenerAnio(),
                valorVehiculo,
                valorMatricula);
        return cadena;
    }

}
