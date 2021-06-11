package POO.Aula18.empressa;

public class Main {
    public static void main(String[] args) {
        Gerente ana = new Gerente("Ana", 100);
        Funcionario ze = new Programador("Ze", 100);

        ControladorDeBonificao controladorDeBonificao = new ControladorDeBonificao();

        controladorDeBonificao.totalizar(ze);
        double total = controladorDeBonificao.totalizar(ana);

        System.out.println(total);

        ana.possuiASenha(123);

        System.out.println(ana.autentica(456));
    }
}
