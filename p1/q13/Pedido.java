package POO.p1.q13;

public class Pedido {

    private float valor;
    private Cliente cliente;


    public Pedido(float valor, Cliente cliente) {
        this.valor = valor;
        this.cliente = cliente;
    }


    public float aplicarDesconto() {
        if (this.cliente.getTipoCliente().getTipo() == "Especial") {
            return this.valor * 0.8f;
        }
        return this.valor;
    }
}
