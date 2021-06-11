package POO.Aula12.problema7Ocamento;

public class Finalizar implements StatusDoOrcamento{
    @Override
    public void estado(Orcamento orcamento) {
        orcamento.setEstado("Finalizado");
    }
}
