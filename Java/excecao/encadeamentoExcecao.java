package excecao;
import java.util.InputMismatchException;
import java.util.Scanner;
  

public class encadeamentoExcecao {

    private static Scanner entrada;
    private static int conta_chamada = 0;

    public static void main(String[] args) {
        entrada = new Scanner(System.in);
        long num = 0;
        do{
            System.out.println("Digite um nuemro inteiro ou \"-1\" para sair do sistema");
            try{
                num = validacaoEntrada(entrada);
            }catch(ErroValidacao erro){
                System.out.println("Entrada invalida!");
                System.out.println("Causa: " + erro.getCause());
                erro.printStackTrace(System.out); //nao faco ideia doq isso faz
                System.exit(-1);
            }
            if(num == -1)
              System.exit(0);
            else
              try{
                 System.out.println("O" + num + "-enesimo numero de fibonacci eh:" + calculcarFibonacci(num));
              }catch(ErroValidacao erro){
                erro.printStackTrace(System.out);
              }
            

        }while(num >=0);


    }



    private static long validacaoEntrada(Scanner scanner) throws ErroValidacao{
        try{
            return entrada.nextLong();
        }catch(InputMismatchException erro_entrada){
            ErroValidacao erro = new ErroValidacao("A entrada" + entrada.next() + "Nao eh um numero intero!");
            erro.atribuirCausa(erro_entrada);
            throw erro;
        }
    }



    public static double calculcarFibonacci(long num) throws ErroValidacao{
        conta_chamada++;
        System.out.println("Chamada Recursiva Numero:" + conta_chamada);
        if(num != 2 && num != 1){
            return calculcarFibonacci(num - 1) + calculcarFibonacci(num - 2);
        }else{
            return 1;
        }
    }



}
/*
 * Fique agora com o passo a passo da atividade!


Abra a IDE e crie a classe Principal sem o tratamento de exceções.
Teste o código calculando termos da sequência de Fibonacci válidos.
Insira o tratamento de exceções, análogo ao exemplo, que trata as exceções de entrada inválida e estouro de pilha.
Teste o código.
 */