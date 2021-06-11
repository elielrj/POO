package POO.p1.q11;

import java.util.ArrayList;
public class Pedido {

    private ArrayList<Item> itens;


    public Pedido() {
        itens = new ArrayList<>();
    }

    public void adicione(Item item){
        itens.add(item);
    }

    public int quantidade() {
        return itens.size();
    }
    /**  ERREI... */
    public ArrayList<Item> getItens() {
        return itens;
    }

    public double pesoTotal(){
        double pesoTotal = 0;
        for(Item item: itens){
            pesoTotal += item.getPesoDoProduto() * item.getQuantidade();
        }
        return pesoTotal;
    }



}
