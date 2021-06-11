package POO.Aula15.formaGeometricaV1;

public class Quadrado implements FormaGeometrica{
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }
}
