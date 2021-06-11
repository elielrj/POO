package POO.p1.q10;

public class Carteira {
    private float valor;



    public Carteira(float valor) {
        this.valor = valor;
    }

    public float getTotalDinheiro() {
        return valor;
    }

    public void adicionarDinheiro(float valor) {
        this.valor = this.valor + valor;
    }

    public void tirarDinheiro(float valor) {
        this.valor = this.valor - valor;
    }
}
