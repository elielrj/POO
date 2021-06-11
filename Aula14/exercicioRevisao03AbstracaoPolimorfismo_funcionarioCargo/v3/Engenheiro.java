package POO.Aula14.exercicioRevisao03AbstracaoPolimorfismo_funcionarioCargo.v3;

public class Engenheiro implements Cargo{
    private  String nome;
    private double salario;


    public Engenheiro(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }


    @Override
    public String nome(){
        return nome;
    }

    @Override
    public double rendimentos(){
        return salario;
    }
}
