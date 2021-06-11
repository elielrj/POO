package POO.Aula14.exercicioRevisao02LeiDemeter_PessoaControleTV;

public class Pessoa {
    private Controle controle;

    public void pegar(Controle controle) {
        this.controle = controle;
    }

    public int aumentarVolume() {
        if(controle != null) {
            if (controle.estaLigada()) {
                return controle.aumentarVolume();
            }
            throw new RuntimeException("TV nao está ligada");
        }
        throw new RuntimeException("Não acho o controle");

    }

    public void ligarTV() {
        controle.ligarTv();
    }

}