package POO.Aula17.heranca06;

public class AlunoBolsista extends Aluno{
    private double valorDaBolsa;

    public AlunoBolsista(String nome, String email, double valorDaBolsa) {
        super(nome, email);
        this.valorDaBolsa = valorDaBolsa;
    }

    public double getValorDaBolsa() {
        return valorDaBolsa;
    }
}
