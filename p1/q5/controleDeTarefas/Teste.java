package POO.p1.q5.controleDeTarefas;

public class Teste {
    public static void main(String[] args) {
        Etapa etapa1 = new Etapa(100,"Aluguel do salão");
        Etapa etapa2 = new Etapa(100,"Encomenda do bolo");
        Etapa etapa3 = new Etapa(50,"Compra de bebida");
        Etapa etapa4 = new Etapa(0,"Compra de itens para decoração");
        Etapa etapa5 = new Etapa(20,"Limpeza do salão");

        Tarefa tarefa1 = new Tarefa("Aniversário da Ana", "Planejamento dos preparativos para a festa da Ana.");

        tarefa1.adicionarEtapa(etapa1);
        tarefa1.adicionarEtapa(etapa2);
        tarefa1.adicionarEtapa(etapa3);
        tarefa1.adicionarEtapa(etapa4);
        tarefa1.adicionarEtapa(etapa5);

        System.out.println("Tarefa - " + tarefa1.getNome());
        System.out.println("");
        System.out.println("* Percentual já concuído = " + tarefa1.percentualConcluiodo() + " %");
        System.out.println("* Percentual faltante = " + tarefa1.percentualFaltante() + " %");
        System.out.println("* Descrição = " + tarefa1.getDescricaoDaTarefa());
        System.out.println("");

        System.out.println("Lista de etapas concluídas:");
        System.out.println("");
        for(Etapa etapa: tarefa1.getEtapas()){
            if(etapa.percentualConcliodo() == 100) {
                System.out.println("* [" + etapa.percentualConcliodo() + " ] " + etapa.descricaoDaExecucao());
            }
        }

        System.out.println("");

        System.out.println("Lista de etapas pendêntes:");
        for(Etapa etapa: tarefa1.getEtapas()){
            if(etapa.percentualConcliodo() != 100) {
                System.out.println("* [" + etapa.percentualConcliodo() + " ] " + etapa.descricaoDaExecucao());
            }
        }
    }
}
