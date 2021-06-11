package POO.Aula18.empressa;

public class SistemaInterno {
    private int senha = 123456;

    public boolean autentica(Autenticavel autenticavel){
        return autenticavel.autentica(this.senha);
    }
}
