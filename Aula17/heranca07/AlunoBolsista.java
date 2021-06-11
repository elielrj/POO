package POO.Aula17.heranca07;

public class AlunoBolsista {
    private double valorDaBolsa;
    private Aluno aluno;

    public AlunoBolsista(Aluno aluno, double valorDaBolsa) {

        this.valorDaBolsa = valorDaBolsa;
        this.aluno = aluno;
    }

    public AlunoBolsista(String nome, String email, double valorDaBolsa) {
        this.aluno = new Aluno(nome, email);
        this.valorDaBolsa = valorDaBolsa;
    }

    public String getNome() {
        return aluno.getNome();
    }

    public String getEmail() {
        return aluno.getEmail();
    }
}
