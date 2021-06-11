package POO.Aula17.heranca07;

public class Main {
    public static void main(String[] args) {
        AlunoBolsista ana = new AlunoBolsista("ana","ana@", 100);
        System.out.println(ana.getNome());

        Aluno bia = new Aluno("ana", "ana@");

        new AlunoBolsista(bia, 100);
        System.out.println(ana.getNome());
    }
}
