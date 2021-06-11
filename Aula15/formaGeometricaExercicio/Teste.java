package POO.Aula15.formaGeometricaExercicio;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        FormaGeometrica circulo1 = new Circulo(10);


        FormaGeometrica circulo2 =  new Circulo(10);
        FormaGeometrica quadrado = new Quadrado(10);

        Registrador registrador = new Registrador();

        registrador.adicionar((circulo1));

        ArrayList<FormaGeometrica> listaDeFormas = new ArrayList<>();

        listaDeFormas.add(circulo2);
        listaDeFormas.add(quadrado);

        registrador.adicionar(listaDeFormas);

        System.out.println(registrador.total());
    }

}
