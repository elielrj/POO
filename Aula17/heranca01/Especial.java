package POO.Aula17.heranca01;

public class Especial extends Aluno{
    private String especialidade;

    public Especial(String nome, String email, String especialidade) {
        super(nome, email);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    @Override
    public String getNome() {
        return "Especial " + super.getNome() + " - " + getEspecialidade();
    }
}
