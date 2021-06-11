package POO.Aula07.assosiacao.unidirecional.d.para24;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private int quantiddeMaxima = 4;
    private int quantiddeMinima = 2;
    private ArrayList<Telefone> telefones;

    public Aluno(String nome, Telefone telefone1, Telefone telefone2){
        this.nome = nome;
        this.telefones = new ArrayList<>();
        cadastrar(telefone1);
        cadastrar(telefone2);
    }

    public void cadastrar(Telefone telefone){
        if(telefones.size() < quantiddeMaxima){
            telefones.add(telefone);
        }
        else{
            System.out.println("Quantidade excedida");
        }
    }
    public void remover(Telefone telefone){
        if(telefones.size() > quantiddeMinima){
            telefones.remove(telefone);
        }else{
            System.out.println("tem que ter no mínimo 2 telefones");
        }
    }

    public int quantidadeDeTelefones(){
        return telefones.size();
    }
}
