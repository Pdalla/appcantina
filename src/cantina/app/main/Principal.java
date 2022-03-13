package cantina.app.main;

import app.cantina.enume.Tprefeicaoenum;
import cantina.app.entidades.*;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        //OBJETOS
        Scanner teclado = new Scanner(System.in);
        Mensagem mensagem = new Mensagem();
        Bebidas bebida = new Bebidas();
        Entrega entrega = new Entrega();
        Bebidas bebidas = new Bebidas();
        Lanches lanches = new Lanches();
        Comida comida = new Comida();
        Calculos calculos = new Calculos();
        int repobebida = 0;
        int repocomida = 0;
        int repolanches = 0;

        //COMECO
        mensagem.MensagemEntrada();

        //BEBIDAS

        mensagem.Bebidas();
        mensagem.Quantidadebebidas();
        bebida.setQtdebebida(teclado.nextInt());
        for (int i=1;i<=bebida.getQtdebebida();i++){
            mensagem.Opcaobebida(i);
            bebida.setOpbebida(teclado.nextInt());
            if (bebida.getOpbebida()==1) {
                repobebida = repobebida +(Tprefeicaoenum.VALOR_REFRIGERANTE.getValor());
            }
            else if (bebida.getOpbebida()==2){
                repobebida = repobebida +(Tprefeicaoenum.VALOR_SUCO.getValor());
            }
            else if (bebida.getOpbebida()==3){
                repobebida = repobebida + (Tprefeicaoenum.VALOR_VINHO.getValor());
            }
            calculos.setCalculobebida(repobebida);
        }
        mensagem.Acrescentar();
        mensagem.setResposta(teclado.next().toUpperCase());
        System.out.println(calculos.getCalculobebida());
            if (mensagem.getResposta().equals("SIM")){
                mensagem.Bebidas();
                mensagem.Quantidadebebidas();
                bebida.setQtdebebida(teclado.nextInt());
                for (int i=1;i<=bebida.getQtdebebida();i++){
                    mensagem.Opcaobebida(i);
                    bebida.setOpbebida(teclado.nextInt());
                    if (bebida.getOpbebida()==1) {
                        repobebida = repobebida +(Tprefeicaoenum.VALOR_REFRIGERANTE.getValor());
                    }
                    else if (bebida.getOpbebida()==2){
                        repobebida = repobebida +(Tprefeicaoenum.VALOR_SUCO.getValor());
                    }
                    else if (bebida.getOpbebida()==3){
                        repobebida = repobebida + (Tprefeicaoenum.VALOR_VINHO.getValor());
                    }
                    calculos.setCalculobebida(repobebida);
                }
            }

        //COMIDA

        mensagem.Comidas();
        mensagem.Quantidadecomidas();
        comida.setQtdecomida(teclado.nextInt());
        for (int i=1;i<=comida.getQtdecomida();i++){
            mensagem.Opcaocomida(i);
            comida.setOpcomida(teclado.nextInt());
            if (comida.getOpcomida()==1) {
                repocomida = repocomida +(Tprefeicaoenum.VALOR_PASTA.getValor());
            }
            else if (comida.getOpcomida()==2){
                repocomida = repocomida +(Tprefeicaoenum.VALOR_LASANHA.getValor());
            }
            else if (comida.getOpcomida()==3){
                repocomida = repocomida +(Tprefeicaoenum.VALOR_PALPETONE.getValor());
            }
            calculos.setCalculocomida(repocomida);
        }
        mensagem.Acrescentar();
        mensagem.setResposta(teclado.next().toUpperCase());
        if (mensagem.getResposta().equals("SIM")){
            mensagem.Comidas();
            mensagem.Quantidadecomidas();
            comida.setQtdecomida(teclado.nextInt());
            for (int i=1;i<=comida.getQtdecomida();i++){
                mensagem.Opcaocomida(i);
                comida.setOpcomida(teclado.nextInt());
                if (comida.getOpcomida()==1) {
                    repocomida = repocomida +(Tprefeicaoenum.VALOR_PASTA.getValor());
                }
                else if (comida.getOpcomida()==2){
                    repocomida = repocomida +(Tprefeicaoenum.VALOR_LASANHA.getValor());
                }
                else if (comida.getOpcomida()==3){
                    repocomida = repocomida + (Tprefeicaoenum.VALOR_PALPETONE.getValor());
                }
                calculos.setCalculocomida(repocomida);
            }
        }


        //LANCHES

        mensagem.Lanches();
        mensagem.Quantidadelanches();
        lanches.setQtdelanches(teclado.nextInt());
        for (int i=1;i<=lanches.getQtdelanches();i++){
            mensagem.Opcaolanche(i);
            lanches.setOplanches(teclado.nextInt());
            if (lanches.getOplanches()==1) {
                repolanches = repolanches +(Tprefeicaoenum.VALOR_BURGUER.getValor());
            }
            else if (lanches.getOplanches()==2){
                repolanches = repolanches +(Tprefeicaoenum.VALOR_PIZZA.getValor());
            }
            else if (lanches.getOplanches()==3){
                repolanches = repolanches +(Tprefeicaoenum.VALOR_FOGAZZA.getValor());
            }
            calculos.setCalculolanches(repolanches);
        }
        mensagem.Acrescentar();
        mensagem.setResposta(teclado.next().toUpperCase());
        if (mensagem.getResposta().equals("SIM")){
            mensagem.Lanches();
            mensagem.Quantidadelanches();
            lanches.setQtdelanches(teclado.nextInt());
            for (int i=1;i<=lanches.getQtdelanches();i++){
                mensagem.Opcaolanche(i);
                comida.setOplanches(teclado.nextInt());
                if (lanches.getOplanches()==1) {
                    repolanches = repolanches +(Tprefeicaoenum.VALOR_BURGUER.getValor());
                }
                else if (lanches.getOplanches()==2){
                    repolanches = repolanches +(Tprefeicaoenum.VALOR_PIZZA.getValor());
                }
                else if (lanches.getOplanches()==3){
                    repolanches = repolanches + (Tprefeicaoenum.VALOR_FOGAZZA.getValor());
                }
                calculos.setCalculolanches(repolanches);
            }
        }
        calculos.setCalculogeral(calculos.getCalculobebida()+ calculos.getCalculolanches()+ calculos.getCalculocomida());
        mensagem.Resumopedido(calculos.getCalculobebida(), calculos.getCalculolanches(), calculos.getCalculocomida(), calculos.getCalculogeral());
        mensagem.MensagemSaida();
    }
}
