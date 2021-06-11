package POO.p2.q2;

import java.util.ArrayList;

public class Kit implements Mercadoria {
    private ArrayList<Item> itens;

    public Kit(){
        itens = new ArrayList<>();
    }

    public void adicionar(Item item){
        itens.add(item);
    }

    @Override
    public String nome(){
        String nome = "kit: ";
        for(Item item: itens){
            nome += item.nome() + " - ";
        }
        return nome;
    }

    @Override
    public double preco(){
        double total = 0;
        for(Item item: itens){
            total += item.preco();
        }
        return total;
    }

}
