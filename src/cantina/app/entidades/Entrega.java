package cantina.app.entidades;

public class Entrega extends Comida{
    private int entrega1;
    private int entrega2;

    public Entrega (){
    }
    public int getEntrega1() {return entrega1;}
    public void setEntrega1(int entrega1) {
        this.entrega1 = entrega1;
    }
    public int getEntrega2() {
        return entrega2;
    }
    public void setEntrega2(int entrega2) {
        this.entrega2 = entrega2;
    }
}
