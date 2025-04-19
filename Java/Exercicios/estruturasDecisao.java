package Exercicios;

import java.util.Calendar;

public class estruturasDecisao {

    public static void main(String[] args) {

      //testes com as estruturas de decisao (if, ternario, switch)
        

        //vamos utilizar primeiro o if 
        int num1 = 20;
        int num2 = 30;

        if(num1 >= num2){
            System.out.println("Numero 1 eh maior");
        }else{
            System.out.println("Numero 2 eh maior");
        }

        //tambem existe o else if que eh como se fosse um intemerdiario para verificar outra situacao caso a primeira nao seja verdaade

        // agora vamos usar o ternario
        System.out.println(num1 < num2 ? "Verdade" : "Falso");

        //agora vamos usar o switch (otimo para quando precisamos verificar varias situacoes)

        int dia = Calendar.DAY_OF_WEEK; //vamos pegar qual o numero do dia eh hoje
        
        switch(dia){
            //o break se faz necessario para que, quando uma case seja realizada, as outras a frente da realizada nao ocorram tbm.
            case 1:
              System.out.println("Domingo");
              break;
            case 2:
              System.out.println("Segunda-feira");
              break;
            case 3:
              System.out.println("Terca-feira");
              break;
            case 4:
              System.out.println("Quarta-feira");
              break;
            case 5:
              System.out.println("Quinta-feira");
              break;
            case 6:
              System.out.println("Sexta-feira");
              break;
            case 7:
              System.out.println("Sabado");
              break;
            default: //o default eh uma boa pratica ja que precisamos inclui-lo caso o numero nao seja de nenhum case
              System.out.println("Numero invalido!!"); 
              break;  
              
        }
    }
}
