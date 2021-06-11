package POO.p1.q4;

public class FolhaDePagamento {
    private double total;
    public double calcular(Funcionario funcionario){
        total+=funcionario.salario();
        return total;
    }
}
