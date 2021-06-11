package POO.Aula06.exercicio02Disciplina;

public class Teste {
    public static void main(String[] args) {
        Disciplina prog2 = new Disciplina("prog2", "prog1");

        System.out.println(prog2.nome());
        System.out.println(prog2.nomeDisciplinaPreRequisito());
    }
}
