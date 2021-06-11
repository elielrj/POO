package POO.p1.q13;

public class TipoCliente {

    private String tipo;

    public TipoCliente(String tipo) {
        this.tipo = tipo;
    }

    public TipoCliente() {
        this("Normal");
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
