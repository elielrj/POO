package POO.Aula20.conta04_Heranca_e_Interface;

public interface Conta {
    void deposita(double valor);
    boolean saca(double valor);
    boolean transfere(double valor, Conta contaDestino);
    double saldo();
    String numero();
}
