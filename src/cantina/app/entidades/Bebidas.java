package cantina.app.entidades;

import app.cantina.enume.Tprefeicaoenum;

public class Bebidas extends Mensagem {
    private int opbebida;
    private int qtdebebida;

    public int getOpbebida() {
        return opbebida;
    }

    public void setOpbebida(int opbebida) {
        this.opbebida = opbebida;
    }

    public int getQtdebebida() {
        return qtdebebida;
    }

    public void setQtdebebida(int qtdebebida) {
        this.qtdebebida = qtdebebida;
    }

    public void Bebidas(){
        System.out.println("Você optou por : "+qtdebebida+"x bebidas do tipo:"+opbebida);

    }


}
