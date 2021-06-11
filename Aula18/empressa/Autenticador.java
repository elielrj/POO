package POO.Aula18.empressa;

public class Autenticador {
    private int senha;

    public void possuiASenha(int novaSenha) {
        this.senha = novaSenha;
    }

    public boolean autentica(int senha){
        if(this.senha == senha){
            return true;
        }
        return false;
    }

}
