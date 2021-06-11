package POO.Aula03.exercicio02.endereco;

public class Cidade {
    private String nome;
    private Estado estado;

    public Cidade(String nome, Estado estado){
        this.nome = nome;
        this.estado = estado;
    }

    //1.2.3
    public String getCidadeEstado(){
        //1.2.3.1
        return this.getNome() + " - " +
                //1.2.3.2
                this.estado.getSigla();
    }

        //1.2.3.2
    public String getNome(){
        return nome;
    }
}
