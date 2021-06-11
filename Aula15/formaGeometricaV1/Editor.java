package POO.Aula15.formaGeometricaV1;

public class Editor {
    private FormaGeometrica forma;

    public Editor(FormaGeometrica forma){
        this.forma = forma;
    }

    public double calcularArea(){
        return forma.area();
    }
}
