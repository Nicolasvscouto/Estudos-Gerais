package projetos.appBanco;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Operacoes operacoes = new Operacoes(); 
     int opcao = 0;
     String nome = "Jonn", conta = "conta Premium";
     Scanner scannerOpcao = new Scanner(System.in);
     String Menu = """
            ** Escolha uma opção **
              1 - Consultar Saldo
              2 - Transferir Valor
              3 - Adicionar saldo
              4 - Sair
            """;
   System.out.println("Seja bem-vindo " + nome + " você está acessando sua " + conta);
   while(opcao != 4){
     System.out.println(Menu);
     opcao = scannerOpcao.nextInt();
     switch (opcao) {
        case 1:
          operacoes.getSaldo();
          break;
        case 2:
          System.out.println("Quanto voce deseja transferir?");
          int saldoDesejado = scannerOpcao.nextInt();
          operacoes.Transferir(saldoDesejado);
          break;
        case 3:
          System.out.println("Quanto você deseja adicionar");
          saldoDesejado = scannerOpcao.nextInt();
          operacoes.adicionarSaldo(saldoDesejado);
          break;
        case 4:
           System.out.println("Saindo...!");
           break;
        default:
          System.out.println("Escolha uma opcao valida por favor!");
     }
   }
   scannerOpcao.close();
   }    
}
