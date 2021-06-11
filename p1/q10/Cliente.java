package POO.p1.q10;

public class Cliente {

    private String nome;
    private Carteira minhaCarterira;

    public Cliente(String nome, float valor) {
        this.nome = nome;
        this.minhaCarterira = new Carteira(valor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Carteira getMinhaCarterira() {
        return minhaCarterira;
    }
}
