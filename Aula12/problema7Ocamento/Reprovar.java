package POO.Aula12.problema7Ocamento;

public class Reprovar implements StatusDoOrcamento {
    @Override
    public void estado(Orcamento orcamento) {
        orcamento.setEstado("Reprovado");
    }
}
