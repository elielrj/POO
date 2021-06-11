package POO.p1.q9;

import java.util.ArrayList;

public class Venda {

    private Conjuntos conjuntos;

    private ArrayList<Item> itens;


    public Venda() {
        itens = new ArrayList<>();
    }

    public void adicione(Item item){
        itens.add(item);
    }

    public ArrayList<Item> getItens() {
        return this.itens;
    }

    public float total(){
        float total = 0;
        for(Item item: itens){
            total += item.subTotal();
        }
        return total;
    }
}
