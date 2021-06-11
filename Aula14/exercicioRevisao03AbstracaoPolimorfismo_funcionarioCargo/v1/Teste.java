package POO.Aula14.exercicioRevisao03AbstracaoPolimorfismo_funcionarioCargo.v1;

public class Teste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Ana", "Engenheiro", 1000.0, 0, 0);
        System.out.println(funcionario.salario());
    }
}
