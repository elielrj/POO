package POO.Aula11.problema6Media;

import java.util.ArrayList;

public class Aritimetica implements Formula {

    @Override
    public float calcular(ArrayList<Nota> notas) {
        float somatorio = 0;

        for(Nota nota: notas){
            somatorio += nota.getValor();
        }
        return somatorio/notas.size();
    }
}
