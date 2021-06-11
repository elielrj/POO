package POO.Aula09.problema1BotaoLampadaLigavel;

public class Teste {
    public static void main(String[] args) {
        Ligavel ligavel = new Motor();
        Botao botao = new Botao(ligavel);

        botao.pressionar();

        System.out.println(ligavel.getEstado());

    }

}
