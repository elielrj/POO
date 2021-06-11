package POO.Aula05.corona;

import java.util.ArrayList;

public class Estado {
    private String sigla;
    private ArrayList<Cidade> cidades;

    public Estado(String sigla) {
        this.sigla = sigla;
        cidades = new ArrayList<>();
    }

    public void _adicionar(Cidade cidade){
        cidades.add(cidade);
    }

    public ArrayList<Cidade> getCidades() {
        return cidades;
    }

    public String sigla() {
        return sigla;
    }
}
