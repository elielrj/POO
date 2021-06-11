package POO.Aula06.exercicio05Curso;

public class Teste {
    public static void main(String[] args) {
        Disciplina d1 = new Disciplina("A", 10);
        Disciplina d2 = new Disciplina("B", 10);
        Disciplina d3 = new Disciplina("C", 10);

        Modulo m1 = new Modulo("1");

        m1.adicionar(d1);;
        m1.adicionar(d2);;
        m1.adicionar(d3);

        d1.concluir();
        d2.concluir();
        d3.concluir();

        System.out.println(m1.concluido());
        System.out.println(m1.cargaHoraria());

        Curso info = new Curso("info");

        info.adicionar(m1);

        System.out.println(info.concluido());
        System.out.println(info.cargaHoraria());


    }
}
