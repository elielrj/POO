package POO.p2.q5;


public class CalculadoraDeTributos implements Calculadora {
	private double valorTotalDeTributos;

	public CalculadoraDeTributos(ContaCorrente conta, SeguroDeVida seguro) {
		valorTotalDeTributos = conta.tributos() + seguro.tributos();
	}

	public CalculadoraDeTributos(ContaCorrente conta) {
		valorTotalDeTributos = conta.tributos();
	}

	public CalculadoraDeTributos(SeguroDeVida seguro) {
		valorTotalDeTributos = seguro.tributos();
	}

	@Override
	public double totalizadorDeTributos() {
		return valorTotalDeTributos;
	}

}
