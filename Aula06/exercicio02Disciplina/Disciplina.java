package POO.Aula06.exercicio02Disciplina;

public class Disciplina {
    private String nome;

    private Disciplina preRequisito;

    public Disciplina(String nome, String preRequisito){
        this.preRequisito = criarDisciplinaPreRequisito(preRequisito);
        this.nome = nome;
    }

    private Disciplina criarDisciplinaPreRequisito(String nome){
        return new Disciplina(nome);
    }

    private Disciplina(String nome){
        this.nome = nome;
    }

    public String nome(){
        return nome;
    }

    public String nomeDisciplinaPreRequisito(){
        return preRequisito.nome();
    }


}
