package POO.Aula06.associacao.unidirecional.b.para01;

public class Aluno {
    private String nome;
    private  Veiculo veiculo;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, Veiculo veiculo){
        this.nome = nome;
        this.veiculo = veiculo;
    }

    public void comprar(Veiculo veiculo){
        this.veiculo = veiculo;
    }

    public void vender(){
        this.veiculo = null;
    }

    public String obterNome() {
        return nome;
    }

    public String obterNomeVeiculo() {
        return veiculo.obterNome();
    }
}
