package POO.p1.q3;

public class A {
    private B b;
    public B metodoDeA(C c){
        return c.metodoDeC().metodoDeB();
    }
}
/**
A Lei de Demeter diz que qualquer método de um objeto só deve chamar métodos pertencentes a:

1 - dele próprio
2 - qualquer parâmetro que tenha sido passado para o método
3 - qualquer objeto que ele tenha criado
4 - qualquer componente mantido diretamente

 */