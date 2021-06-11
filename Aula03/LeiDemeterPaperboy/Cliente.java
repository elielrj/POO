package POO.Aula03.LeiDemeterPaperboy;

public class Cliente {
    private String nome;
    private Carteira minhaCarteira;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public boolean pagar(float divida) {
        if (this.minhaCarteira != null) {
            if (this.minhaCarteira.quantia() > divida) {
                this.minhaCarteira.retirarQuantia(divida);
                return true;
            }
        }
        return false;
    }
    public void adicionarQuantiaNaCarteira(int quantia) {
        if(this.minhaCarteira != null) {
            this.minhaCarteira.adicionarQuantia(quantia);
        } else {
            throw  new RuntimeException("Comprar carteira antes");
        }
    }
    public void retirarQuantiaNaCarteira(float quantia) {
        minhaCarteira.retirarQuantia(quantia);
    }
    public void comprarCarteira(){ // Substituir
        float quantia = 0;
        if (this.minhaCarteira != null){
            quantia = this.minhaCarteira.quantia();
        }
        this.minhaCarteira = new Carteira();
        this.minhaCarteira.adicionarQuantia(quantia);
    }
    public void perderCarteira(){
        this.minhaCarteira = null;
    }
}