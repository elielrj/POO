package POO.Aula14.exercicioRevisao02LeiDemeter_PessoaControleTV;

public class TV {
    private boolean ligada;
    private Controle controle;
    private int volumeAtual;

    public TV() {
        this.volumeAtual = 20;
        this.ligada = false;
    }

    public Controle controle() {
        this.controle = new Controle(this);
        return this.controle;
    }

    public int aumentarVolume() {
        return ++this.volumeAtual;
    }
    public void ligar() {
        this.ligada = true;
    }

    public boolean estaLigada() {
        return ligada;
    }
}