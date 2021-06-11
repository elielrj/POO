package POO.p1.q11;

public class Frete {
    private Pedido pedido;


    public Frete(Pedido pedido) {
        this.pedido = pedido;
    }


    public double calculaPesoTotalDoPedido(){
        return pedido.pesoTotal();
    }
}
