package POO.Aula12.problema7Ocamento;

public class Orcamento {
    private String estado;

    public Orcamento() {
        estado = "Em aprovação";
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void criarOrcamento() {
        this.estado = "Em aprovação";
    }


    public void reprovarOrcamento() {
        if (this.estado.equalsIgnoreCase("Em aprovação")) {
            this.estado = "Reprovado";
        } else if (this.estado.equalsIgnoreCase("Reprovado")){
            System.out.println("Já está reprovado ");
        } else if (this.estado.equalsIgnoreCase("Finalizado")){
            System.out.println("Não pode ser reprovado, pois já foi finalizado");
        }
    }


}
