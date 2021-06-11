package POO.Aula06.exercicio01Marca;

public class Teste {
    public static void main(String[] args) {
        Marca vw = new Marca("VW");
        Modelo gol = new Modelo(vw, "Gol");

        //Modelo gol = new Modelo(new Marca("VW"), "Gol");

        System.out.println(gol.nome() + "-" + gol.nomeMarca());
    }

}
