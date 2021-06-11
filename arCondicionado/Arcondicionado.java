package POO.arCondicionado;

public class Arcondicionado {
    private byte temperaturaMinima;
    private byte temperaturaMaxima;
    private byte temperaturaAtual;

    public Arcondicionado(){
        this.temperaturaMinima = 16;
        this.temperaturaMaxima = 30;
        this.temperaturaAtual = 24;
    }

    public byte getTemperaturaAtual(){
        return this.temperaturaAtual;
    }

    public void aumentarTemperatura(){
        if(temperaturaAtual < temperaturaMaxima){
            this.temperaturaAtual++;
        }
    }

    public void diminuirTemperatura(){
        if(temperaturaAtual < temperaturaMinima){
            this.temperaturaAtual--;
        }
    }

    public byte getTemperaturaMinima(){
        return temperaturaMinima;
    }

    public byte getTemperaturaMaxima(){
        return temperaturaMaxima;
    }
}

