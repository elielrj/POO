package POO.Aula11.problema4Saudacao;

public class Teste {

    public static void main(String[] args) {
        Saudacao saudacao = new Formal();

        //OU
        //Saudacao saudacao = new Informal();

        //ou
        //Saudacao saudacao = new Padrao();


        Pessoa jose = new Pessoa("Jose", saudacao);

        System.out.println(jose.getSaudacao());
    }
}
