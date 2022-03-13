package app.cantina.entidades;

import cantina.app.interfaces.ENtrega;

public class Entrega implements ENtrega {
    private int entregadef;
    private int entregaadd;

    public int getEntregadef() {return entregadef;}
    public void setEntregadef(int entregadef) {
        this.entregadef = entregadef;
    }
    public int getEntregaadd() {
        return entregaadd;
    }
    public void setEntregaadd(int entregaadd) {
        this.entregaadd = entregaadd;
    }

    @Override
    public void entregadefault(int entregadef) {

    }

    @Override
    public void entregaacrescimo(int entregaadd) {

    }
}
