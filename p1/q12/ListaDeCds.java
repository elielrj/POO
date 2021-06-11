package POO.p1.q12;

import java.util.ArrayList;

public class ListaDeCds {

    private ArrayList<CD> cds;

    public ListaDeCds(){
        cds = new ArrayList<>();
    }

    public void adicionar(CD cd) {
        cds.add(cd);
    }

    public void remover(CD cd){
        cds.remove(cd);
    }

    public int quantidade() {
        return cds.size();
    }

    public int quantidadeDeMuiscasIgauisNosCDS(String musica){

       int i = 0;

       for(CD cd: cds){
            i += cd.quantidadeDeMusicasIguais(musica);
        }
       return i;
    }

    public void listarCDSAssociadosUmaMusica(String nomeMusica){

            for(CD cd: cds){
                if(cd.igualMusica(nomeMusica)){
                    System.out.println(cd.getNomeCD());
                }

            }


    }

    public void remover(String musica){
        if(quantidadeDeMuiscasIgauisNosCDS(musica) > 1){
            for(CD cd: cds){
                cd.removerMusica(musica);
            }
        }

    }


}
