package POO.arCondicionado;

public class Teste {
    public static void main(String[] args){
        Arcondicionado arcondicionado = new Arcondicionado();
        Professor professor = new Professor();
        professor.setArcondicionado(arcondicionado);

        for (int i = 0; i < 20 ; i++){
            professor.aumentarTemperatura();
        }

        System.out.println(arcondicionado.getTemperaturaAtual());

    }
}
