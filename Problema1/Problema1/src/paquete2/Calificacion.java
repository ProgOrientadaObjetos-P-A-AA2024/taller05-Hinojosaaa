package paquete2;

public class Calificacion {

    private String nomEstudiante;
    private double materia1;
    private double materia2;
    private double materia3;
    private double promedio;

    public Calificacion(String ne, double m1, double m2) {
        nomEstudiante = ne;
        materia1 = m1;
        materia2 = m2;
        materia3 = (materia1 + materia2) / 2;
    }

    public Calificacion(String ne, double m1, double m2, double m3) {
        nomEstudiante = ne;
        materia1 = m1;
        materia2 = m2;
        materia3 = m3;
    }

    public void establecerNombre(String x) {
        nomEstudiante = x;
    }

    public void establecerM1(double x) {
        materia1 = x;
    }

    public void establecerM2(double x) {
        materia2 = x;
    }

    public void establecerM3(double x) {
        materia3 = x;
    }

    public void calcularPromedio() {
        promedio = (materia1 + materia2 + materia3) / 3;
    }

    public String obtenerNombre() {
        return nomEstudiante;
    }

    public double obtenerM1() {
        return materia1;
    }

    public double obtenerM2() {
        return materia2;
    }

    public double obtenerM3() {
        return materia3;
    }

    public double obtenerProm() {
        return promedio;
    }

    @Override
    public String toString() {
        String cadena = String.format("Tabla de Calificaciones\n"
                + "Nombre del estudiante: %s\n"
                + "Calificacion de la Materia 1: %.2f\n"
                + "Calificacion de la Materia 2: %.2f\n"
                + "Calificacion de la Materia 3: %.2f\n"
                + "Promedio de las materias es de: %.2f\n",
                obtenerNombre(),
                obtenerM1(),
                obtenerM2(),
                obtenerM3(),
                obtenerProm());
        return cadena;
    }

}
