package POO.p2.q2;

public class Servico implements Mercadoria {
    private String nome;
    private double preco;

    public Servico(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String nome(){
        return nome;
    }
    @Override
    public double preco(){
        return preco;
    }

}
