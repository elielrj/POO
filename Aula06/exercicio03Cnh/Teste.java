package POO.Aula06.exercicio03Cnh;

public class Teste {

    public static void main(String[] args) {
        Cnh cnh1 = new Cnh("2345");
        Cnh cnh2 = new Cnh("43457");
        Pessoa pessoa1 = new Pessoa("Eliel", cnh1);
        Pessoa pessoa2 = new Pessoa("Fernanda", cnh2);


        System.out.println(pessoa1.getNumeroDaCnh() + pessoa1.getNome());
        System.out.println(pessoa2.getNumeroDaCnh() + pessoa2.getNome());

    }
}
