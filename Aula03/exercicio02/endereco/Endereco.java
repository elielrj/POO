package POO.Aula03.exercicio02.endereco;

public class Endereco {
    private String rua;
    private String numero;
    private Cidade cidade;

    public Endereco(String rua, String numero, Cidade cidade){
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
    }

    //1.2
    public String getEnderecoCidade(){
        //1.2.1
            return this.getRua() + " - "+
                //1.2.2
                this.getNumero() + " - " +
                    //1.2.3
                    this.cidade.getCidadeEstado();
    }

    //1.2.1
    public String getRua(){
        return rua;
    }

    //1.2.2
    public String getNumero(){
        return numero;
    }
}
