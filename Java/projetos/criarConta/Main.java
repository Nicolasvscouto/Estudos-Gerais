package projetos.criarConta;

import java.util.Scanner;

public class Main{  
    private static Scanner newScanner = new Scanner(System.in); 
    private static Login testeLogin = new Login();
    private static String nome, CPF, email, password;
    private static int idade, choice;
    private static CriarConta conta1 = new CriarConta();

    public static void main(String[] args) {
        do{
         System.out.println("Ola. O que voce deseja? \n 1 - Criar conta \n 2 - Logar na sua conta \n 3 - Mostrar suas informacoes \n 4 - Sair");
         choice = newScanner.nextInt();
         newScanner.nextLine();
         switch(choice){
                case 1:
                 conta1 = adicionarElementosConta();
                 System.out.println("Sua conta foi criada com sucesso!");
                 break;
                case 2:
                 entrarConta();
                 break;
                case 3:
                 infoConta(conta1);
                 break;
                case 4:
                 System.out.println("Saindo...");
                 break;
                default:
                 System.out.println("Digite um numero valido por favor!");
                 break;
            }
        }while(choice != 4);
        newScanner.close();
    }



    private static void infoConta(CriarConta conta) {
        try{
          System.out.println("Aqui esta suas informacoes:");
          System.out.println("Nome: " + conta.getNome());
          System.out.println("Email:" + conta.getEmail());
          System.out.println("CPF:" + conta.getCPF());
          System.out.println("Idade: " + conta.getIdade());
        }catch(NullPointerException e){
            System.out.println("Voce ainda nao criou uma conta!");
        }
        
    }



    private static void entrarConta() {
        boolean erro = false;
        System.out.println("Qual seu username?");
        nome = newScanner.nextLine();
        if(nome.trim().isEmpty()){
            System.out.println("Parece que voce nao digitou nada!");
            erro = true;
        }
        System.out.println("Qual sua Password");
        password = newScanner.nextLine();
        if(password.trim().isEmpty()){
            System.out.println("Parece que voce nao digitou nada!");
            erro = true;
        }
        if(erro){
            System.out.println("Operacao cancelada!");
        }
        testeLogin.LogarConta(nome, password);
    }



    private static CriarConta adicionarElementosConta() {
        boolean erro = false;
        System.out.println("Vamos precisar de umas informacoes para criar sua conta!");

        System.out.println("Qual seu nome?");
        nome = newScanner.nextLine();
        if(nome.trim().isEmpty()){
            System.out.println("Entrada invalida. Digite um nome valido!");
            erro = true;
        }

        System.out.println("Qual seu CPF?");
        CPF = newScanner.nextLine();
        if(CPF.trim().isEmpty()){
            System.out.println("Entrada invalida. Digite um CPF valido!");
            erro = true;
        }

        System.out.println("Qual sua idade?");
        try{
            idade = newScanner.nextInt();
            newScanner.nextLine(); //matar a quebra de linha
        }catch(java.util.InputMismatchException e){
            System.out.println("Entrada invalida. Digite uma idade valida!");
            newScanner.nextLine();
            erro = true;
        }

        System.out.println("Qual seu email?");
        email = newScanner.nextLine();
        if(email.trim().isEmpty()){
            System.out.println("Entrada invalida. Digite um email valido!");
            erro = true;
        }

        if(erro){
            System.out.println("Nao conseguimos criar sua conta por devidos problemas!");
            return null;
        }
        

       return new CriarConta(nome, email, idade, CPF);  
    }
}