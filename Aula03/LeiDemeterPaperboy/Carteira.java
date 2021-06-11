package POO.Aula03.LeiDemeterPaperboy;

public class Carteira {
    private float quantia;

    public float quantia() {
        return quantia;
    }
    public void adicionarQuantia(float quantia) {
        this.quantia = this.quantia + quantia;
    }
    public void retirarQuantia(float quantia) {
        this.quantia = this.quantia - quantia;
    }

}