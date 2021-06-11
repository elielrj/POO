package POO.Aula14.exercicioRevisao02LeiDemeter_PessoaControleTV;

public class Controle {
    private TV tv;

    public Controle(TV tv) {
        this.tv = tv;
    }

    public int aumentarVolume() {
        return tv.aumentarVolume();
    }

    public boolean estaLigada() {
        return tv.estaLigada();
    }

    public void ligarTv() {
        tv.ligar();
    }
}
