package POO.Aula11.problema3Vagas;

import java.util.ArrayList;

public class GerenciadorDoIFSC implements Gerenciador{
    private ArrayList<Vaga> vagas;

    public GerenciadorDoIFSC() {
        this.vagas = new ArrayList<>();
    }

    @Override
    public int quantidadeTotalDeBeneficios() {
        int quantidadeDeBeneficios = 0;
        for(Vaga vaga: vagas){
            quantidadeDeBeneficios += vaga.quantidadeDeBeneficios();
        }
        return quantidadeDeBeneficios;
    }

    @Override
    public void registrarVaga(Vaga vaga) {
        vagas.add(vaga);
    }

    @Override
    public int totalDeVagas() {
        return vagas.size();
    }

    @Override
    public double valorTotalEmBeneficios() {
        double valorTotalEmBeneficios = 0;
        for(Vaga vaga: vagas){
            for(Beneficio beneficio: vaga.beneficios()){
                valorTotalEmBeneficios += beneficio.getValor();
            }
        }
        return valorTotalEmBeneficios;
    }

    @Override
    public double valorTotalEmRemuneracao() {
        int valorTotalEmRemuneracao = 0;
        for(Vaga vaga: vagas){
            valorTotalEmRemuneracao += vaga.remuneracao();
        }
        return valorTotalEmRemuneracao;
    }

    @Override
    public double valorTotalEmRemuneracaoEBeneficios() {
        return valorTotalEmBeneficios() + valorTotalEmRemuneracao();
    }
}
