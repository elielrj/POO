package POO.Aula20.conta06_composicao_e_interface;

public interface Conta {
    void deposita(double valor);
    boolean saca(double valor);
    double saldo();
    String numero();
}
