package POO.Aula18.empressa;

public class ControladorDeBonificao {
    private double total;

    public double totalizar(Funcionario funcionario){
        total += funcionario.bonificacao();
        return total;
    }
}
