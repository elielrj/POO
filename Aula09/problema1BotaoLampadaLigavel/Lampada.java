package POO.Aula09.problema1BotaoLampadaLigavel;

public class Lampada implements Ligavel{
    private String estado = "apagada";


    @Override
    public void liga_desliga() {
        if(getEstado().equalsIgnoreCase("acesa")){
            apagar();
        }else{
            acender();
        }
    }

    private void acender() {
        estado = "acesa";
    }

    private void apagar() {
        estado = "apagada";
    }

    @Override
    public String getEstado() {
        return estado;
    }


}
