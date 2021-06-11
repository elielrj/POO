package POO.Aula18.empressa;

public class Cliente implements Autenticavel{

    private Autenticador autenticador;

    public Cliente() {
        autenticador = new Autenticador();
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
