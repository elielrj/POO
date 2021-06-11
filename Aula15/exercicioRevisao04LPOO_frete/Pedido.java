package POO.Aula15.exercicioRevisao04LPOO_frete;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Item> itens;

    public ArrayList<Item> getItens(){
        return itens;
    }

    public double pesoTotal() {
        double pesoTotal = 0;

        for (Item item : itens) {
            pesoTotal += item.getPesoDoProduto() * item.getQuantidade();
        }
        return pesoTotal;
    }
}