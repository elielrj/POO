package POO.Aula18.empressa;

public class Administrador extends Funcionario implements Autenticavel{
    private Autenticador autenticador;

    public Administrador(String nome, double salario) {
        super(nome, salario);
        autenticador = new Autenticador();
    }

    @Override
    public double bonificacao() {
        return 50;
    }

    @Override
    public void possuiASenha(int novaSenha) {
        this.autenticador.possuiASenha(novaSenha);
    }

    @Override
    public boolean autentica(int senha){
               return autenticador.autentica(senha);
    }
}
