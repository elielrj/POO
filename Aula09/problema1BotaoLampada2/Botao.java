package POO.Aula09.problema1BotaoLampada2;

public class Botao {
    private Lampada lampada;

    public Botao(Lampada lampada) {
        this.lampada = lampada;
    }

    public void pressionar() {
        lampada.liga_desliga();
    }

}
