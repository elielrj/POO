package POO.Aula15.formaGeometricaExercicio;

public class Circulo implements FormaGeometrica {
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double area(){
        return Math.PI * raio * raio;
    }
}
