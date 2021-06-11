package POO.Aula07.assosiacao.unidirecional.d.para24;

public class Teste {
    public static void main(String[] args) {
        Telefone telefone1 = new Telefone("83534345");
        Telefone telefone2 = new Telefone("83534345");
        Telefone telefone3 = new Telefone("83534345");
        Telefone telefone4 = new Telefone("83534345");
        Telefone telefone5 = new Telefone("83534345");


        Aluno ze = new Aluno("ze", telefone1, telefone5);

        ze.remover(telefone1);

        System.out.println(ze.quantidadeDeTelefones());

        ze.cadastrar(telefone2);
        ze.cadastrar(telefone3);
        ze.cadastrar(telefone4);

        System.out.println(ze.quantidadeDeTelefones());


    }
}
