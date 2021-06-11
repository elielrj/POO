package POO.Aula11.problema3Vagas;

import java.util.ArrayList;

public interface Vaga {
    double remuneracao();
    ArrayList<Beneficio> beneficios();
    void adicionarBeneficio(Beneficio beneficio);
    int quantidadeDeBeneficios();
}
