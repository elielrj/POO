package POO.Aula06.associacao.unidirecional.b.para01;

public class Teste {
    public static void main(String[] args) {
        Veiculo uno = new Veiculo("Uno");

        Aluno ze = new Aluno("Ze");

        System.out.println(ze.obterNomeVeiculo());

        ze.vender();

        System.out.println(ze.obterNomeVeiculo());

    }
}
