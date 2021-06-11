package POO.Aula18.ProdutoKitCestaBasica;

public class Produto implements Mercadoria{
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
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
