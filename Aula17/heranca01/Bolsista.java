package POO.Aula17.heranca01;

public class Bolsista extends Aluno {
    private double valorBolsa;

    public Bolsista(String nome, String email, double valorBolsa) {
        super(nome, email);
        this.valorBolsa = valorBolsa;
    }

    public double getValorBolsa() {
        return valorBolsa;
    }

    //reescreve metodos do construtor 'pai'
    @Override
    public String getNome() {
        return "nome novo";
    }
}
