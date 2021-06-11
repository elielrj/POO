package POO.Aula15.exercicioRevisao04LPOO_frete;

public class Frete {
    private Pedido pedido;

    public Frete(Pedido pedido){
        this.pedido = pedido;
    }

    public double calcularPesoTotalDoPedido(){
        return pedido.pesoTotal();
    }
}
