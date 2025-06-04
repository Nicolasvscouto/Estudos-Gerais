package projetos.controleCartaoCredito;

import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = leitura.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);


        int saida = 1;
        while(saida != 0){
            System.out.println("Qual a descricao do produto que deseja adquirir?");
            String descricaoCompra = leitura.next();

            System.out.println("Qual o valor da compra?");
            double valorCompra = leitura.nextDouble();

            Compra novaCompra = new Compra(descricaoCompra, valorCompra);
            Boolean CompraRealizada = cartao.lancarCompra(novaCompra);
            if(CompraRealizada){
                System.out.println("Compra realizada com sucesso!");
                System.out.println("Aperte 0 para sair e 1 para continuar!");
                saida = leitura.nextInt();
            }else{
                System.out.println("Saldo insuficiente!");
                saida = 0;
            }
        }


            System.out.println("****************");
            System.out.println("COMPRAS REALIZADAS!");
            Collections.sort(cartao.getListaCompras());
            for(Compra c: cartao.getListaCompras()){
                System.out.println(c.getDescricao() + " - " + c.getValor());
            }
            System.out.println("****************");


            System.out.println("Saldo do Cartão: " + cartao.getSaldo());            
            leitura.close();
        
    }




}