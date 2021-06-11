package POO.Aula07.assosiacao.unidirecional.c.para03;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private int quantiddeDeTelefones = 3;
    private ArrayList<Telefone> telefones;

    public Aluno(String nome){
        this.nome = nome;
        this.telefones = new ArrayList<>();
    }

    public void cadastrar(Telefone telefone){
        if(telefones.size() <= 2){
            telefones.add(telefone);
        }
        else{
            System.out.println("Quantidade excedida");
        }
    }
    public void remover(Telefone telefone){
        telefones.remove(telefone);
    }

    public int quantidadeDeTelefones(){
        return telefones.size();
    }
}
