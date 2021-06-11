package POO.Aula06.associacao.unidirecional.a.paraUm;

public class Teste {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Ze");
        Carro carro = new Carro("Gol", pessoa);

        String dono = carro.getDono();
        System.out.println(dono);


    }
}
