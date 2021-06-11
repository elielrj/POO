package POO.Aula09.problema1BotaoLampadaLigavel;

public class Motor implements Ligavel {
    private String estado = "desligado";

    @Override
    public void liga_desliga(){
        if(getEstado().equalsIgnoreCase("ligado")){
            desligar();
        }else{
            ligar();
        }
    }

    private void ligar() {
        estado = "ligado";
    }

    private void desligar() {
        estado = "desligado";
    }

    @Override
    public String getEstado() {
        return estado;
    }


}
