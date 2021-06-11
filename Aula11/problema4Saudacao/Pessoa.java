package POO.Aula11.problema4Saudacao;

public class Pessoa {
    private String nome;
    private Saudacao saudacao;

    public Pessoa(String nome, Saudacao saudacao) {
        this.nome = nome;
        this.saudacao = saudacao;
    }

    public Pessoa(String nome) {
        this.nome = nome;
        this.saudacao = new Padrao();
    }

    public String getNome() {
        return nome;
    }

    public String getSaudacao() {
        return saudacao.getSaudacao();
    }
}
