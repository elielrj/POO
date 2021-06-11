package POO.Aula05.biblioteca;

import java.util.ArrayList;

public class Livro {
    private ArrayList<Autor> autores;

    public Livro() {
        autores = new ArrayList<>();
    }

    public void adicionar(Autor autor) {
        autores.add(autor);
    }

    public int quantidadeDeAutores() {
        return autores.size();
    }
}
