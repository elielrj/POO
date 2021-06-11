package POO.Aula11.problema5Combustivel;

public class Teste {
    public static void main(String[] args) {
        Posto posto = new Posto();

        Combustivel combustivel = new Gasolina();
        //OU
        //Combustivel combustivel = new Diesel();


        float valor = posto.abastecer(combustivel, 10);

        System.out.println(valor);



    }
}

