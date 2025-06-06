package EstruturaRepeticao;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        //realizacao de alguns exercicios

       //contagem de degraus
       int numeroDegraus = 5;
       for(int i = 0; i <= 5; i++){
        System.out.println("Subindo degrau: " + i);
       }

       //soma de numeros:

       int[] valores = {10,20,30,40,50};
       int somaDosTermos = 0;

       for(int i = 0; i < valores.length; i++){
         somaDosTermos += valores[i];
       }

       System.out.println(somaDosTermos);

       
       //soma dos numeros que sao pares
       int valorPares = 0;

       for(int i = 0; i <= 100; i++){
         if(i%2 == 0){
            valorPares += i;
         }
       }

       System.out.println(valorPares);


       //calculo de fatorial


       //System.out.println("Digite qual numero voce deseja fazer fatorial: ");
       int numeroFatorial = 5;

       int fatorial = 1;

       for (int i = 1; i <= numeroFatorial; i++) {
            fatorial *= i;
        }

       System.out.println("Esse eh o fatorial do numero que voce escolheu: " + fatorial);



       //encontrando o maior numero de um array

       System.out.println("Digite os numeros separados por espaco: ");
       String[] numerosStr = newScanner.nextLine().split(" ");
       int maior = Integer.MIN_VALUE;


       for(String numString : numerosStr){
         int num = Integer.parseInt(numString);
         if(num > maior){
            maior = num;
         }
       }

       System.out.println("Maior numero eh: " + maior);



       //limitando tentativas de login

       final String SENHA_CORRETA = "1245";

       for(int tentativas = 3; tentativas > 0; tentativas--){
         System.out.println("Digite a sua senha!");
         String senha = newScanner.nextLine();

         if(senha.equals(SENHA_CORRETA)){
            System.out.println("Logado com sucesso!");
            tentativas = 0;
         }else if(tentativas > 1){
            System.out.println("Senha errada, voce tem mais " + tentativas + " tentativas");
         }else{
            System.out.println("Acesso bloqueado temporariamente!");
         }
         
       }
     



       //pedindo o nome valido


       final String NOME_VALIDO = "Ana";
       String nome = "";

       do{
        System.out.println("Digite o seu nome!");
        nome = newScanner.nextLine();
        if(nome.length() < 3){
            System.out.println("Nome invalido. Tente novamente!");
        }

       }while(nome.length() < 3);
       System.out.println("Nome digitado:  " + nome + " cadastrado com sucesso!");


    }
}
