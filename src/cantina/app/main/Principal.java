package cantina.app.main;

import app.cantina.enume.Tprefeicaoenum;
import cantina.app.entidades.*;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Mensagem mensagem = new Mensagem();
        Bebidas bebida = new Bebidas();
        Entrega entrega = new Entrega();
        Bebidas bebidas = new Bebidas();
        Lanches lanches = new Lanches();
        Comida comida = new Comida();
        Calculos calculos = new Calculos();
        mensagem.MensagemEntrada();
        mensagem.Bebidas();
        mensagem.Quantidadebebidas();
        bebida.setQtdebebida(teclado.nextInt());
        mensagem.Opcaobebida();
        bebida.setOpbebida(teclado.nextInt());
        if (bebida.getOpbebida()==1) {
            bebida.setOpbebida(Tprefeicaoenum.VALOR_REFRIGERANTE.getValor());
        }
            else if (bebida.getOpbebida()==2){
                bebida.setOpbebida(Tprefeicaoenum.VALOR_SUCO.getValor());
            }
            else if (bebida.getOpbebida()==3){
                bebida.setOpbebida(Tprefeicaoenum.VALOR_VINHO.getValor());
            }
        calculos.setCalculobebida(bebida.getOpbebida() * bebida.getQtdebebida());
        mensagem.Acrescentar();
        mensagem.setResposta(teclado.next().toUpperCase(Locale.ROOT));
        if (mensagem.getResposta()=="SIM"){

        }
        //COMIDA

        mensagem.Comidas();
        mensagem.Quantidadecomidas();
        comida.setQtdecomida(teclado.nextInt());
        mensagem.Opcaocomida();
        comida.setOpcomida(teclado.nextInt());
        if (comida.getOpcomida()==1) {
            comida.setOpcomida(Tprefeicaoenum.VALOR_PASTA.getValor());
        }
        else if (comida.getOpcomida()==2){
            comida.setOpcomida(Tprefeicaoenum.VALOR_LASANHA.getValor());
        }
        else if (comida.getOpcomida()==3){
            comida.setOpcomida(Tprefeicaoenum.VALOR_PALPETONE.getValor());
        }
        calculos.setCalculocomida(comida.getOpcomida() * comida.getQtdecomida());
        mensagem.Acrescentar();
        if (mensagem.getResposta()=="SIM"){
        }

        //LANCHES

        mensagem.Lanches();
        mensagem.Quantidadelanches();
        lanches.setQtdelanches(teclado.nextInt());
        mensagem.Opcaolanche();
        lanches.setOplanches(teclado.nextInt());
        if (lanches.getOplanches()==1) {
            lanches.setOplanches(Tprefeicaoenum.VALOR_BURGUER.getValor());
        }
        else if (lanches.getOplanches()==2){
            lanches.setOplanches(Tprefeicaoenum.VALOR_PIZZA.getValor());
        }
        else if (lanches.getOplanches()==3){
            lanches.setOplanches(Tprefeicaoenum.VALOR_FOGAZZA.getValor());
        }
        calculos.setCalculolanches(lanches.getOplanches() * lanches.getQtdelanches());
        mensagem.Acrescentar();
        if (mensagem.getResposta()=="SIM"){
        }
        calculos.setCalculogeral(calculos.getCalculobebida()+ calculos.getCalculolanches()+ calculos.getCalculocomida());
        mensagem.Resumopedido();
        mensagem.MensagemSaida();

    }
}
