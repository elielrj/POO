package POO.p2.q3;

import java.util.ArrayList;

public final class Cliente {

    private String nome;
    private ArrayList<Locacao> fitasLocadas;


    public Cliente(String nome) {
        this.nome = nome;
        fitasLocadas = new ArrayList<>();
    }

    public String getNome () {
        return nome;
    }

    public void adicionaAluguel(Locacao locacao) {
        fitasLocadas.add(locacao);
    }

    public double valorTotal(){
        double valorCorrente = 0;

        for(Locacao fitaLocada: fitasLocadas){
            valorCorrente += fitaLocada.valorDaFita();
        }
        return valorCorrente;
    }

    public int pontuacao(){
        int pontos = 0;

        for(Locacao fita: fitasLocadas){
            pontos += fita.potosDaFita();
        }
        return pontos;
    }

    public String extrato() {
        String resultado = "Registro de locações de " + getNome() + "\n";


        for (Locacao f : fitasLocadas) {
            resultado += f.getFita();
        }
        resultado += "Valor total devido: R$ " + this.valorTotal() + "\n";
        resultado += "Voce acumulou " + this.pontuacao() + " pontos de alugador frequente" ;

        return resultado;
    }

}