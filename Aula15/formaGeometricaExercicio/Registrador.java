package POO.Aula15.formaGeometricaExercicio;

import java.util.ArrayList;

public class Registrador {
    private ArrayList<FormaGeometrica> formas;

    public Registrador() {
        this.formas = new ArrayList<>();
    }

    public void adicionar(FormaGeometrica formaGeometrica) {
        formas.add(formaGeometrica);
    }

    public void adicionar(ArrayList<FormaGeometrica> formas) {
        this.formas.addAll(formas);
    }


    public void remover(FormaGeometrica formaGeometrica) {
        formas.remove(formaGeometrica);
    }

    public double total(){
        double total = 0;
        for(FormaGeometrica formaGeometrica : formas){
            total += formaGeometrica.area();
        }
        return total;
    }
}
