import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        operacoes op = new operacoes();
        Scanner newScanner = new Scanner(System.in);
        int opcao = 0;
        do{
            System.out.println("Ola, bem-vindo a calculadora! \n Vamos realizar alguns calculos?");
            System.out.println("Qual operacao deseja realizar? \n 1- Soma \n 2- Subtracao \n 3- Divisao \n 4 - Multiplicacao \n 5 - Sair do Sistema");
            opcao = newScanner.nextInt();
            switch(opcao){
                case 1:
                 op.pedirNumero();
                 int soma = op.somarNumeros();
                 System.out.println("Aqui esta o resultado da sua soma: " + soma);
                 opcao = 5;
                 break;
                case 2:
                 op.pedirNumero();
                 soma = op.subtrairNumero();
                 System.out.println("Aqui esta o resultado da sua soma: " + soma);
                 opcao = 5;
                 break;
                case 3:
                 op.pedirNumero();
                 soma = op.dividirNumero();
                 System.out.println("Aqui esta o resultado da sua soma: " + soma);
                 opcao = 5;
                 break;
                case 4:
                 op.pedirNumero();
                 soma = op.multiplicarNumero();
                 System.out.println("Aqui esta o resultado da sua soma: " + soma);
                 opcao = 5;
                 break;
                case 5:
                 System.out.println("Saindo....");
                 break;

                default:
                 System.out.println("Numero invalido, tente novamente!");
                 break;
            }
        }while(opcao != 5);

        newScanner.close();
    }
}