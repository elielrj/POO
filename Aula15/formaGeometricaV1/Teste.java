package POO.Aula15.formaGeometricaV1;

public class Teste {
    public static void main(String[] args) {

        //FormaGeometrica forma = new Circulo(10);
        //OU
        FormaGeometrica forma = new Quadrado(10);

        Editor editor = new Editor(forma);

        System.out.println(editor.calcularArea());
    }
}
