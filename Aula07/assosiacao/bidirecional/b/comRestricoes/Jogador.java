package POO.Aula07.assosiacao.bidirecional.b.comRestricoes;

public class Jogador {
    private String nome;
    private Time time;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public void definir(Time novoTime) {
        time = novoTime;
    }

    public String nomeTime() {
        if(time != null){
            return time.obterNome();
        }
        return  "Sem time";
    }

    public String obterNome() {

        return nome;
    }

    public Time getTime() {
        return time;
    }

    public void desligueseDoTime() {
        if(time != null) {
            time.dispensar(this);
        }
    }
}
