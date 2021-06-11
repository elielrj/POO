package POO.Aula11.problema3Vagas;

import java.util.ArrayList;

public class VagaDeEmprego implements Vaga {
    private double salario;
    private final ArrayList<Beneficio> beneficios;

    public VagaDeEmprego(double salario) {
        this.salario = salario;
        this.beneficios = new ArrayList<>();
    }

    @Override
    public double remuneracao() {
        return salario;
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
