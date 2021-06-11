package POO.Aula05.biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;

    public Biblioteca(){
        livros = new ArrayList<>();
    }

    public int quantidadeDeLivros() {
        return livros.size();
    }

    public void adicionar(Livro livro) {
        livros.add(livro);
    }

    public Livro remove(int index) {
        return livros.remove(index);
    }

    public void excluirTodosLivros() {
        livros.clear();
    }

    public int quantidadeDeAutores(){
        int total = 0;
        for(Livro livro: livros){
            total = total +  livro.quantidadeDeAutores();
        }
        return total;
    }
}
