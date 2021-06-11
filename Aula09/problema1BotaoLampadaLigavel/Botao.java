package POO.Aula09.problema1BotaoLampadaLigavel;

public class Botao{
    private Ligavel ligavel;

    public Botao(Ligavel ligavel) {
        this.ligavel = ligavel;
    }

    public void pressionar() {
        ligavel.liga_desliga();
    }

}
