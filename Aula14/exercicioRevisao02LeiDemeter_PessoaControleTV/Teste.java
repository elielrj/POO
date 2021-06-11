package POO.Aula14.exercicioRevisao02LeiDemeter_PessoaControleTV;

public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        TV tv = new TV();
        Controle controle = tv.controle();


        pessoa.pegar(controle);

        pessoa.ligarTV();

        int volume = pessoa.aumentarVolume();
        System.out.println(volume);

        pessoa.aumentarVolume();
    }
}
