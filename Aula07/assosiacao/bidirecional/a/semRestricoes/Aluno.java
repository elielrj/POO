package POO.Aula07.assosiacao.bidirecional.a.semRestricoes;

import java.util.ArrayList;

public class Aluno {
    private String nome;

    private ArrayList<Livro> livros;

    public Aluno(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public  void adicionar(Livro livro){
        livros.add(livro);
        livro._adicionar(this);
    }

    public int quantidadeDeLivros(){
        return livros.size();
    }



    public String getNome() {
        return nome;
    }

}
