package POO.Aula11.problema3Vagas;

public interface Gerenciador {
    int quantidadeTotalDeBeneficios();
    void registrarVaga(Vaga vaga);
    int totalDeVagas();
    double valorTotalEmBeneficios();
    double valorTotalEmRemuneracao();
    double valorTotalEmRemuneracaoEBeneficios();
}
