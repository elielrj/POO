package POO.Aula09.problema1BotaoLampada2;

public class Teste {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        Botao botao = new Botao(lampada);

        for (int click = 1; click <= 5; click++) {
            botao.pressionar();
            System.out.println(lampada.getEstado());
        }

    }

}
