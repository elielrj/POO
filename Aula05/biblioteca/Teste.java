package POO.Aula05.biblioteca;

public class Teste {
    public static void main(String[] args) {
        Autor a = new Autor();
        Autor b = new Autor();
        Autor c = new Autor();

        Livro livro1 = new Livro();
        Livro livro2 = new Livro();

        livro1.adicionar(a);

        livro2.adicionar(b);
        livro2.adicionar(c);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionar(livro1);
        biblioteca.adicionar(livro2);

        System.out.println(biblioteca.quantidadeDeAutores());

    }
}
