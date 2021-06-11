package POO.Aula06.associacao.unidirecional.a.paraUm;

public class Carro {

	private String modelo;

	private Pessoa dono;

	public Carro(String modelo, Pessoa dono) {
		this.modelo = modelo;
		this.dono = dono;
	}

	public String getModelo() {
		return modelo;
	}

	public String getDono() {
		return dono.getNome();
	}
}
