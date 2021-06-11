package POO.Aula11.problema3Vagas;

public class ValeTransporte implements Beneficio{
    private String nome;
    private float valor;

    public ValeTransporte(String nome, float valor) {
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
