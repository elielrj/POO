package POO.Aula03.exercicio02.endereco;

public class Teste {
    public static void main(String[] args) {
        Estado estado = new Estado("SC");
        Cidade cidade = new Cidade("Tubarão", estado);
        Aluno aluno = new Aluno("Ana", "Rua x", "123", cidade);

        //método 1
        System.out.println(aluno.getEnderecoCompleto());
    }
}
