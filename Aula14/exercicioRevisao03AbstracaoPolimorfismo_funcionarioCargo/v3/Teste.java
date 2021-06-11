package POO.Aula14.exercicioRevisao03AbstracaoPolimorfismo_funcionarioCargo.v3;

public class Teste {
    public static void main(String[] args) {
        Cargo cargo = new Diretor("Diretor", 5000, 100);
        //Cargo cargo = new Vendedor("Vendedor", 1000);
        //Cargo cargo = new Vendedor("Engenheiro", 1000, 100);

        Funcionario ana = new Funcionario("Ana", cargo);

        System.out.println(ana.salario());

    }
}
