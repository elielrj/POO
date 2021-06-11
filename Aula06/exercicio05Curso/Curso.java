package POO.Aula06.exercicio05Curso;

import java.util.ArrayList;

public class Curso {
    private String nome;
    private ArrayList<Modulo> modulos;

    public Curso(String nome){
        this.nome = nome;
        this.modulos = new ArrayList<>();
    }

    public void adicionar(Modulo modulo){
        this.modulos.add(modulo);
    }

    public int cargaHoraria(){
        int total = 0;

        for(Modulo modulo: modulos){
            total = total + modulo.cargaHoraria();
        }
        return total;
    }

    public boolean concluido(){
        for(Modulo modulo: modulos){
            if(!modulo.concluido()) {
                return false;
            }
        }
        return true;
    }

}
