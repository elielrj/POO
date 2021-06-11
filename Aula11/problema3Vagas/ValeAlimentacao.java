package POO.Aula11.problema3Vagas;

public class ValeAlimentacao implements Beneficio {

    private String nome;
    private double valor;
    public ValeAlimentacao(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getValor() {
        return valor;
    }
}
