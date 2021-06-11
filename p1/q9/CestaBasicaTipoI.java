package POO.p1.q9;

import java.util.ArrayList;

public class CestaBasicaTipoI implements Conjuntos{

    private ArrayList<Item> conjuntoDeitens;

    public CestaBasicaTipoI() {
        conjuntoDeitens = new ArrayList<>();

        Produto produto1 = new Produto("Arroz", 5);
        Produto produto2 = new Produto("Feijão", 8);
        Produto produto3 = new Produto("Leite", 3);
        Produto produto4 = new Produto("Óleo", 4);
        Produto produto5 = new Produto("Margarina", 8);
        Produto produto6 = new Produto("Farinha", 3);
        Produto produto7 = new Produto("Carne", 30);

        Item item1 = new Item(produto1, 5);
        Item item2 = new Item(produto2, 3);
        Item item3 = new Item(produto3, 10);
        Item item4 = new Item(produto4, 2);
        Item Item5 = new Item(produto5, 1);
        Item item6 = new Item(produto6, 2);
        Item item7 = new Item(produto7, 3);

        conjuntoDeitens.add(item1);
        conjuntoDeitens.add(item2);
        conjuntoDeitens.add(item3);
        conjuntoDeitens.add(item4);
        conjuntoDeitens.add(Item5);
        conjuntoDeitens.add(item6);
        conjuntoDeitens.add(item7);
    }

    public void adicionarItem(Item item) {
        conjuntoDeitens.add(item);
    }

    @Override
    public ArrayList<Item> itens() {
        return conjuntoDeitens;
    }


}
