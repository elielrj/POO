package POO.Aula09.problema1BotaoLampada;

public class Botao {
    private Lampada lampada;

    public Botao(Lampada lampada) {
        this.lampada = lampada;
    }

    public void pressionar() {
        if (this.lampada.getEstado().equals("apagada")) {
            this.lampada.acender();
        } else {
            this.lampada.apagar();
        }
    }

}
