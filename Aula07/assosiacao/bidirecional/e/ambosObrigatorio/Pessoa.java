package POO.Aula07.assosiacao.bidirecional.e.ambosObrigatorio;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private ArrayList<Telefone> telefones;

    public Pessoa(String nome, String numero) {
        this.nome = nome;
        this.telefones = new ArrayList<>();
        Telefone telefone = new Telefone(numero, this);
        //this.adicionar(telefone);
    }

    public void adicionar(Telefone telefone){
        this.telefones.add(telefone);
    }

    public void excluir(Telefone telefone){
        if(this.telefones.size() > 1) {
            this.telefones.remove(telefone);
        }else{
            System.out.println("peo menos um telefone");
        }
    }

    public void excuirTodosTelefones(){
        this.telefones.clear();
    }


    public String nome(){
        return nome;
    }

    public ArrayList<Telefone> getTelefones() {
        return telefones;
    }
}
