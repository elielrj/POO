package POO.Aula17.heranca01;

public class Teste {
    public static void main(String[] args) {
        Bolsista bolsista = new Bolsista("ze", "emaildoze", 200);

        System.out.println(bolsista.getNome());
        System.out.println(bolsista.getEmail());
        System.out.println(bolsista.getValorBolsa());



        Aluno aluno = new Bolsista("ze", "emaildoze", 200);

        System.out.println(aluno.getNome());
        System.out.println(aluno.getEmail());
        //aluno não tem bolsa


        Especial especial = new Especial("ana", "emaildaana", "aaaa");
        System.out.println(especial.getNome());
        System.out.println(especial.getEspecialidade());



    }
}
