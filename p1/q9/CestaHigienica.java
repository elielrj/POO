package POO.p1.q9;

import java.util.ArrayList;

public class CestaHigienica implements Conjuntos{

        private ArrayList<Item> conjuntoDeitens2;

    public CestaHigienica() {
            conjuntoDeitens2 = new ArrayList<>();

            Produto produto1 = new Produto("Pasta de Dente", 5);
            Produto produto2 = new Produto("Escova", 8);
            Produto produto3 = new Produto("Papel Higiênico", 3);
            Produto produto4 = new Produto("Álcool", 4);


            Item item1 = new Item(produto1, 5);
            Item item2 = new Item(produto2, 3);
            Item item3 = new Item(produto3, 10);
            Item item4 = new Item(produto4, 2);


            conjuntoDeitens2.add(item1);
            conjuntoDeitens2.add(item2);
            conjuntoDeitens2.add(item3);
            conjuntoDeitens2.add(item4);

        }

        public void adicionarItem(Item item) {
            conjuntoDeitens2.add(item);
        }

        @Override
        public ArrayList<Item> itens() {
            return conjuntoDeitens2;
        }

    }
