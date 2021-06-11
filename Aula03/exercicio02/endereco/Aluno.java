package POO.Aula03.exercicio02.endereco;

public class Aluno {
    private Endereco endereco;
    private  String nome;

    Aluno(String nome, String rua, String numero, Cidade cidade){
        this.nome = nome;
        this.endereco = new Endereco(rua, numero, cidade);
    }

    //1
    public  String getEnderecoCompleto(){
        return
                //1.1
        this.getNome()
                + " - " +
                //1.2
                this.endereco.getEnderecoCidade();
    }

    //1.1
    public  String getNome(){
        return nome;
    }

}
