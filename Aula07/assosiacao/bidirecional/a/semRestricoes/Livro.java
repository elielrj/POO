package POO.Aula07.assosiacao.bidirecional.a.semRestricoes;

import java.util.ArrayList;

public class Livro {
    private String titulo;

    private ArrayList<Aluno> alunos;

    public Livro(String titulo) {
        this.titulo = titulo;
        this.alunos = new ArrayList<>();
    }

    public void _adicionar(Aluno aluno){
        alunos.add(aluno);
    }

    public int  quantidadeDeAlunos(){
        return alunos.size();
    }



    public String getTitulo() {
        return titulo;
    }
}
