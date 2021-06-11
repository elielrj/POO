package POO.Aula03.OEntregadorJornalSuaCarteira;

public class Cliente{

    private String nome;
    private Carteira minhaCarteira;

    public Cliente(String nome) {
        this.nome = nome;
        this.minhaCarteira = new Carteira();
    }

    public String getNome() {
        return nome;
    }

    public float pagar(float divida) {
        if (minhaCarteira != null) {
            if (minhaCarteira.getTotalDinheiro() > divida) {
                minhaCarteira.tirarDinheiro(divida);
                return divida;
            }
        }
        return -1;
    }
}

