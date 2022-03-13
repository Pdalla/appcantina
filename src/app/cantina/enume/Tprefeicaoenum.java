package app.cantina.enume;

public enum Tprefeicaoenum {

    VALOR_BURGUER(30),
    VALOR_PIZZA(45),
    VALOR_FOGAZZA(20),
    VALOR_PASTA(30),
    VALOR_LASANHA(70),
    VALOR_PALPETONE(50),
    VALOR_REFRIGERANTE(5),
    VALOR_SUCO(7),
    VALOR_VINHO(50);

    public int valor;

    Tprefeicaoenum(int valor){
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}

