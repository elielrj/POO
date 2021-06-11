package POO.Aula05.corona;

import java.util.ArrayList;

public class Cidade {
    private String nome;
    private Estado estado;

    private ArrayList<Caso> casos;

    public Cidade(String nome, Estado estado) {
        this.nome = nome;
        this.estado = estado;
        estado._adicionar(this);
        this.casos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String siglaDeEstado(){
        return estado.sigla();
    }
    public void registrar(Caso caso){
        casos.add(caso);
    }

    public void registrar(int quantidade, Caso caso){
        for (int i = 0; i < quantidade; i++) {
            registrar(caso);
        }
    }

    public void registrar(int idade, Genero genero){
        Caso caso = new Caso(idade, genero);
        registrar(caso);
    }
}
