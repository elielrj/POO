package POO.Aula18.empressa;

public class Gerente extends Funcionario implements Autenticavel{

private Autenticador autenticador;
    public Gerente(String nome, double salario) {
        super(nome, salario);
        this.autenticador = new Autenticador();
    }

    @Override
    public double bonificacao() {
        return 200;
    }


    @Override
    public void possuiASenha(int novaSenha) {
        this.autenticador.possuiASenha(novaSenha);
    }

    @Override
    public boolean autentica(int senha){
        return this.autenticador.autentica(senha);
    }
}
