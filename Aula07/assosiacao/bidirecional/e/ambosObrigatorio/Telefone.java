package POO.Aula07.assosiacao.bidirecional.e.ambosObrigatorio;

public class Telefone {
    private String numero;

    private Pessoa pessoa;

    public Telefone(String numero, Pessoa pessoa) {
        this.numero = numero;
        this.pessoa = pessoa;
    }

    public String numero(){
        return numero;
    }

    public String nomeDaPessoa() {
        return pessoa.nome();
    }
}
