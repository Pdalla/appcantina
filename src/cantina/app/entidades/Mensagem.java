package cantina.app.entidades;

import cantina.app.main.Principal;

import java.sql.SQLOutput;

public class Mensagem extends Calculos {

    Calculos calculos = new Calculos();
    public void MensagemEntrada (){
        System.out.println("Seja bem Vindo à Cantina Codifichiamo");
    }
    public void MensagemSaida(){
        System.out.println("Obrigado pelo pedido – Conte conosco");
    }
    public void Bebidas(){
        System.out.println("Segue nosso cárdapio de bebidas: \n"+
                "·1   \tRefrigerante- $5\n" +
                "·2   \tSuco - $7\n" +
                "·3   \tVinho -  $50");
    }



    public void Lanches(){
        System.out.println("Segue nosso cárdapio de lanches: \n"+
                "·1   \tBurguer - $30\n" +
                "·2  \tPizza - $45\n" +
                "·3   \tFogazza  -$20");
    }
    public void Comidas(){
        System.out.println("Segue nosso cárdapio de comidas: \n"+
                "·1   \tPasta - $30\n" +
                "·2   \tLasanha - $70\n" +
                "·3  \tPolpetone -  $50");
    }
    public void Quantidadebebidas(){
        System.out.println("Quantas bebidas você deseja:\n");
    }
    public void Opcaobebida(int bebidanum){
        System.out.println("Qual  a "+bebidanum+" bebida?:\n");
    }

    public void Quantidadecomidas(){
        System.out.println("Quantas comidas você deseja:\n");
    }
    public void Opcaocomida(int comidanum){
        System.out.println("Qual  a "+comidanum+" comida?:\n");
    }
    public void Quantidadelanches(){
        System.out.println("Quantos lanches você deseja:\n");
    }
    public void Opcaolanche(int lanchenum){
        System.out.println("Qual  a "+lanchenum+" comida?:\n");
    }
    public void Acrescentar(){
        System.out.println("Você deseja repetir?:\n");
    }
    public void Resumopedido(int bebida,int laches,int comida,int total){
        System.out.println("O Total do Pedido resultou em: \n"+
                "BEBIDAS:"+bebida+"\n"+
                "LACNHES:"+laches+"\n"+
                "COMIDAS:"+comida+"\n"+
                "TOTAL:"+total);
    }

    public String resposta;
    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

}
