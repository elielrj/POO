package POO.Aula17.heranca02;

public class Vendedor extends Funcionario{
    private double comissao;

    public Vendedor(String nome, double salrio, double comissao) {
        super(nome, salrio);
        this.comissao = comissao;
    }

    @Override
    public double getSalrio() {
        return super.getSalrio() + comissao;
    }

    @Override
    public void metoAbstrato() {
        this.comissao = comissao; //qualquer coisa
    }
}
