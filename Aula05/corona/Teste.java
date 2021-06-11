package POO.Aula05.corona;

public class Teste {

    public static void main(String[] args) {
        Estado sc = new Estado("SC");
        Estado pr = new Estado("PR");

        Cidade tubarao = new Cidade("Tubarao", sc);

        Cidade criciuma = new Cidade("Criciuma", sc);

        sc._adicionar(criciuma);

        for(Cidade cidade:sc.getCidades()){
            System.out.println(cidade.getNome());
        }

        tubarao.registrar(90,Genero.F);
        tubarao.registrar(10,new Caso(80,Genero.M));

        Caso caso = new Caso(70, Genero.M);
        tubarao.registrar(caso);


    }
}
