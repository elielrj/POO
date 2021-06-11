package POO.arCondicionado;

public class Professor {
    private Arcondicionado arcondicionado;

    public void aumentarTemperatura(){
        arcondicionado.aumentarTemperatura();
    }

    public void diminuirTemperatura(){
        arcondicionado.diminuirTemperatura();
    }

    public  void setArcondicionado(Arcondicionado arcondicionado){
        this.arcondicionado = arcondicionado;
    }

}
