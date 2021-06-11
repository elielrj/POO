package POO.Aula09.problema1BotaoLampada2;

public class Lampada {
    private String estado;

    public Lampada() {
        this.estado = "apagada";
    }

    public void acender() {
        this.estado = "acesa";
    }

    public void apagar() {
        this.estado = "apagada";
    }

    public String getEstado() {
        return estado;
    }

    public void liga_desliga() {
        if(getEstado().equalsIgnoreCase("acesa")){
            apagar();
        }else{
            acender();
        }
    }
}
