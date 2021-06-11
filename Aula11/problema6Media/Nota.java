package POO.Aula11.problema6Media;

public class Nota {
    private final float valor;
    private float peso;

    public Nota(float valor){
        this.valor = valor;
        this.peso = 0;
    }

    public Nota(float valor, float peso){
        this.valor = valor;
        this.peso = peso;
    }

    public float getValor(){
        return valor;
    }

    public float getPeso() {
        return peso;
    }
}
