package POO.Aula12.problema7Ocamento;

public class Aprovar implements StatusDoOrcamento{
    @Override
    public void estado(Orcamento orcamento) {
        orcamento.setEstado("Aprovado");
    }
}
