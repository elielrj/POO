package POO.Aula06.associacao.unidirecional.c.paraMuitos;

import java.util.ArrayList;

public class Estudante {
    private String nome;

    private ArrayList<Celular> celulares;

    public Estudante(String nome){
        this.nome = nome;
        celulares = new ArrayList<>();
    }

    public void adicionar(Celular celular){
        celulares.add(celular);
    }

    public void remover(Celular celular){
        celulares.remove(celular);
    }

    public int quantidade(){
        return celulares.size();
    }

    public void removerTodos() {
        celulares.clear();
    }

    //cuidado não se faz isso! Não se deve dar acesso completo aos membros da classe!
    public ArrayList<Celular> listarCelulares() {
        return celulares;
    }
}
