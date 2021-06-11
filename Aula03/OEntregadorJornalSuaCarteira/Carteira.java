package POO.Aula03.OEntregadorJornalSuaCarteira;

public class Carteira {
    private float valor;


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
