package POO.Aula06.exercicio03Cnh;

public class Pessoa {
    private String nome;
    private  Cnh cnh;

    public Pessoa(String nome){
        this(nome, null);
    }

    public  Pessoa(String nome, Cnh cnh){
        this.nome = nome;
        this.cnh = cnh;
    }

    public void adicionarCNH(Cnh cnh){
        this.cnh = cnh;
    }

    public String getNumeroDaCnh(){
        return cnh.getNumeroDaCnh();
    }

    public String getNome() {
        return nome;
    }
}
