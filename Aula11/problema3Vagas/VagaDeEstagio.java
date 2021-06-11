package POO.Aula11.problema3Vagas;

import java.util.ArrayList;

public class VagaDeEstagio implements Vaga {
    private double remuneração;
    private ArrayList<Beneficio> beneficios;

    public VagaDeEstagio(double remuneração) {
        this.remuneração = remuneração;
        beneficios = new ArrayList<>();
    }

    @Override
    public double remuneracao() {
        return remuneração;
    }

    @Override
    public ArrayList<Beneficio> beneficios() {
        return beneficios;
    }

    @Override
    public void adicionarBeneficio(Beneficio beneficio) {
        beneficios.add(beneficio);
    }

    @Override
    public int quantidadeDeBeneficios() {
        return beneficios.size();
    }
}
