package POO.Aula06.exercicio01Marca;

public class Modelo {
    private String nome;

    private  Marca marca;

    public Modelo(Marca marca, String nome){
        this.nome = nome;
        this.marca = marca;
    }

    public String nome(){
        return nome;
    }

    public String nomeMarca(){
        return marca.nome();
    }



}
