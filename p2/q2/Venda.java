package POO.p2.q2;

import java.util.ArrayList;

public class Venda {
    private ArrayList<Item> itens;

    public Venda() {
        itens = new ArrayList<>();
    }

    public void setItens(Item item) {
        itens.add(item);
    }

    public double total(){
        double total =0;

        for(Item item: itens){
            total+= item.preco();
        }
        return total;
    }

    public ArrayList<String> listarItens(){
        ArrayList<String> lista = new ArrayList<>();
        for(Item item: itens){
            lista.add(item.nome());
        }
        return lista;
    }
    public ArrayList<Item> getItens(){
        return itens;
    }

    public void adicionar(Item item) {
        itens.add(item);
    }
}
