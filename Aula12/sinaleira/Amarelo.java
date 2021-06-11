package POO.Aula12.sinaleira;

public class Amarelo implements Estado{

    @Override
    public void mudar(Sinaleira sinaleira) {
        try

        {
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        sinaleira.setEstado(new Vermelha());
    }

    @Override
    public String getEstado() {
        return "Amarelo";
    }
}
