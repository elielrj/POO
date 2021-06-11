package POO.Aula11.problema6Media;

import java.util.ArrayList;

public class CalculadorDeNotas {

    public float calcularMedia(ArrayList<Nota> notas, Formula formula){
        return formula.calcular(notas);
    }
}
