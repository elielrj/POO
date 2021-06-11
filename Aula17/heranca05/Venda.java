package POO.Aula17.heranca05;

import java.util.ArrayList;

public class Venda {
    private ArrayList<Item> itens;

    public Venda(){
        itens = new ArrayList<>();
    }

    public void adicionar(Item item){
        itens.add(item);
    }

    public int quantidade(){
        return itens.size();
    }

}
