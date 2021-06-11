package POO.Aula11.problema6Media;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        CalculadorDeNotas calculadorDeNotas = new CalculadorDeNotas();

        ArrayList<Nota> notas = new ArrayList<>();

        Nota nota1 = new Nota(6);
        Nota nota2 = new Nota(8);

        notas.add(nota1);
        notas.add(nota2);

        Formula aritimetica = new Aritimetica();
        float media = calculadorDeNotas.calcularMedia(notas, aritimetica);

        System.out.println(media);



        ArrayList<Nota> notas2 = new ArrayList<>();

        Nota nota3 = new Nota(3,2);
        Nota nota4 = new Nota(7,8);

        notas2.add(nota3);
        notas2.add(nota4);

        Formula ponderada = new Ponderada();
        float mediaPonderada = calculadorDeNotas.calcularMedia(notas2, ponderada);

        System.out.println(mediaPonderada);

    }
}
