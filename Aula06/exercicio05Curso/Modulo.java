package POO.Aula06.exercicio05Curso;

import java.util.ArrayList;

public class Modulo {
    private String nome;
    private ArrayList<Disciplina> disciplinas;

    public Modulo(String nome){
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public void adicionar(Disciplina disciplina){
        disciplinas.add(disciplina);
    }

    public void remover(Disciplina disciplina){
        disciplinas.remove(disciplina);
    }

    public int cargaHoraria(){
        int total = 0;

        for(Disciplina disciplina: disciplinas){
            total = total + disciplina.cargaHoraria();
        }
        return total;
    }

    public boolean concluido(){
        for(Disciplina disciplina: disciplinas){
            if(!disciplina.concluida()){
                return false;
            }
        }
        return true;
    }


    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }
}
