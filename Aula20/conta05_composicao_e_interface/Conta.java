package POO.Aula20.conta05_composicao_e_interface;

public interface Conta {
    void deposita(double valor);
    boolean saca(double valor);
    boolean transfere(double valor, Conta conta);
    double saldo();
    String numero();
}
