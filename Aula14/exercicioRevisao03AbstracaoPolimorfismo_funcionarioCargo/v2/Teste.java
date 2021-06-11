package POO.Aula14.exercicioRevisao03AbstracaoPolimorfismo_funcionarioCargo.v2;

public class Teste {
    public static void main(String[] args) {

        Cargo engenheiro = new Cargo("Engenheiro", 1000, 0, 0);
        Cargo vendedor = new Cargo("Vendedor", 1000, 100, 0);

        Funcionario funcionario = new Funcionario("Ana", engenheiro);
        System.out.println(funcionario.salario());
    }
}
