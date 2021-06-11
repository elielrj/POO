package POO.Aula11.problema3Vagas;

public class Teste {
    public static void main(String[] args) {
        Beneficio valeTransporte = new ValeTransporte("Vale Transporte", 200);
        Beneficio valeAlimentacao = new ValeAlimentacao("Vale refeição", 300);

        Vaga vagaDeEstagio = new VagaDeEstagio(1000);
        vagaDeEstagio.adicionarBeneficio(valeTransporte);
        vagaDeEstagio.adicionarBeneficio(valeAlimentacao);

        Vaga vagaDeEmprego = new VagaDeEmprego(3000);
        vagaDeEmprego.adicionarBeneficio(valeTransporte);


        Gerenciador ifsc = new GerenciadorDoIFSC();
        ifsc.registrarVaga(vagaDeEmprego);
        ifsc.registrarVaga(vagaDeEstagio);

        double totalEmBeneficios = ifsc.valorTotalEmBeneficios();
        System.out.println(totalEmBeneficios);

        int totaDeVagas = ifsc.totalDeVagas();
        System.out.println(totaDeVagas);
    }

}
