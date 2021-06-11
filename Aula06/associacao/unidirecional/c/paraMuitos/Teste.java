package POO.Aula06.associacao.unidirecional.c.paraMuitos;

public class Teste {
    public static void main(String[] args) {
        Celular celular1 = new Celular("222222");
        Celular celular2 = new Celular("223322");

        Estudante ze = new Estudante("Ze");

        ze.adicionar(celular1);
        ze.adicionar(celular2);

        System.out.println(ze.quantidade());

        //ze.removerTodos();

        //System.out.println(ze.quantidade());

        //modo errado p/ imprimir todos os celulares
        //System.out.println(ze.listarCelulares());

        for(Celular celular: ze.listarCelulares()){
            System.out.println(celular.obterNumero());
        }
        // Não é legar retornar a lista de celular acima... como demonstrado acima...
        // pq pode apagar a lista... ou seja... não foi encapsulado...

        //cuidado não se faz isso!
        ze.listarCelulares().clear();

        System.out.println(ze.quantidade());
    }
}
