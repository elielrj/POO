package POO.Aula17.heranca02;

public class Programador extends Funcionario {
    private int horaExtra;

    public Programador(String nome, double salrio, int horaExtra) {
        super(nome, salrio);
        this.horaExtra = horaExtra;
    }

    public double getSalrioComComissao() {
        return super.getSalrio() + horaExtra;
    }

    @Override
    public void metoAbstrato() {
        this.horaExtra = horaExtra; //qualquer coisa
    }
}
