package POO.Aula11.problema6Media;

import java.util.ArrayList;

public class Ponderada implements Formula{
    @Override
    public float calcular(ArrayList<Nota> notas) {
        float somatorio = 0;
        float somatorioDosPesos = 0;

        for(Nota nota: notas){
            somatorio += nota.getValor() * nota.getPeso();
            somatorioDosPesos += nota.getPeso();
        }
        return somatorio/somatorioDosPesos;
    }
}
