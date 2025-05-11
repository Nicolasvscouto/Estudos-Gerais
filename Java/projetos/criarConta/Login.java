package projetos.criarConta;

import java.util.Scanner;


public class Login {
    private String usernameReal = "Nicolas";
    private String passwordReal = "8455";
    Scanner newScanner = new Scanner(System.in); 

    public void LogarConta(String username, String password){
      if(username.equals(usernameReal)){
            if(password.equals(passwordReal)){
               System.out.println(ContaLogada());
            }else{
                System.out.println("Parece que voce errou seu email ou sua senha. Tente novamente!");
            }
        }else{
            System.out.println("Parece que voce errou seu email ou sua senha. Tente novamente!");
        }
    }


    public String ContaLogada(){
        String mensagemDoDia = "Ola Nicolas. A mensagem do dia eh: PLAYSTATIONNN";
        return mensagemDoDia;
    }
    

}
