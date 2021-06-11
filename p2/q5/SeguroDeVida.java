package POO.p2.q5;

public class SeguroDeVida extends SeguroPadrao {

	private SeguroPadrao seguro;
	private double tributos = 1.00;

	public SeguroDeVida(String nome, double valor) {
		super(nome, valor);
	}

	public String getNome() {
		return seguro.getNome();
	}

	public double getValor() {
		return seguro.getValor();
	}

	public void setValor(double valor) {
		seguro.setValor(valor);
	}

	public double tributos(){
		return  tributos;
	}

}
