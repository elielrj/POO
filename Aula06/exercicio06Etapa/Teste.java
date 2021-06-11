package POO.Aula06.exercicio06Etapa;

public class Teste {
    public static void main(String[] args) {
        Etapa compra_carne = new Etapa("Compra carne");
        compra_carne.concluir();

        Etapa comprar_cerveja = new Etapa("Comprar cerveja", 100);

        Etapa comprar_carvao = new Etapa("Compar carvao", 50);
        Etapa limpar_churasqueira = new Etapa("Churasqueira");
        Etapa comprar_sal = new Etapa("Sal", 20);

        Tarefa tarefa = new Tarefa("Churrasco", "Churasco na casa do Willian");

        tarefa.adicionar(compra_carne);
        tarefa.adicionar(comprar_cerveja);
        tarefa.adicionar(comprar_carvao);
        tarefa.adicionar(limpar_churasqueira);
        tarefa.adicionar(comprar_sal);

        limpar_churasqueira.concluir();

        comprar_carvao.definirPercentual(70);

        System.out.println("Percentual concluida: " + tarefa.percentualConlcuida());
        System.out.println("Percentual faltante: " + tarefa.percentualFaltante());

        System.out.println("Lista de etapas concuídas");

        for(Etapa etapa: tarefa.listarEtapasConcluidas()){
            System.out.println("[" + etapa.getPercentualConcluido() + "] - " + etapa.getDescricao());
        }

        System.out.println("Lista de etapas pendentes");
        for(Etapa etapa: tarefa.listarEtapasPendentes()){
            System.out.println("[" + etapa.getPercentualConcluido() + "] - " + etapa.getDescricao());
        }


    }
}
