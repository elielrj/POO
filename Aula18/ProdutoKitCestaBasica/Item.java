package POO.Aula18.ProdutoKitCestaBasica;

public class Item {
    private Mercadoria mercadoria;
    private  int quantidade;

    public Item(Mercadoria mercadoria, int quantidade) {
        this.mercadoria = mercadoria;
        this.quantidade = quantidade;
    }

    public Item(Mercadoria mercadoria){
        this(mercadoria, 1);
    }

    public double preco(){
        return quantidade * mercadoria.preco();
    }

    public String nome(){
        return mercadoria.nome();
    }

    public int getQuantidade(){
        return quantidade;
    }

}
