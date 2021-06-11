package POO.Aula07.assosiacao.bidirecional.e.ambosObrigatorio;

public class Teste {
    public static void main(String[] args) {

        Pessoa ze = new Pessoa("ze", "8765");

        Telefone telefone = new Telefone("33532", ze);

        for(Telefone t: ze.getTelefones()){
            System.out.println(t.numero());
        }

        ze.excluir(telefone);

        System.out.println("Após a exclusão");
        for(Telefone t: ze.getTelefones()){
            if(t.numero().equalsIgnoreCase("8765")){

            }
            System.out.println(t.numero());
        }


    }
}
