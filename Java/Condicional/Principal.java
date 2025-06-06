package Condicional;

public class Principal {
    public static void main(String[] args) {
        //vamos aprender a respeito de estruturas de condicao que podem alterar o fluxo do programa de acordo com certas condicoes

        int idade = 20;

        //Aqui entramos em uma estrutura que vai fazer a checagem de uma condicao. Se a condicao for verdadeira o fluxo do programa continua normal, porem, se for falsa o fluxo do programa ira tomar outro rumo e depois voltara ao normal.

        if(idade > 18){
            System.out.println("Voce eh maior de idade");
        }else{
            System.out.println("Voce eh menor de idade");
        }

        //agora vamos para uns exemplos (exercicios)

        //ver se o numero eh impar ou par

        int numeroImparOuPar = 20;

        if(numeroImparOuPar % 2 == 0){ 
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }

        //verificar se o aluno esta aprovado com base na media dele

        float media = 7f;

        if(media >= 7.0){
            System.out.println("Aprovado");
        }else if(media >= 5.0 && media <= 6.9){
            System.out.println("Recuperacao");
        }else{
            System.out.println("Reprovado");
        }

        
        //podemos fazer verificacao de Strings tambem, mas ai nao usamos os operadores de comparacao, usamos o metodo equals para verificar se o conteudo do objeto eh o mesmo e nao se ele esta apontando para o mesmo valor da memoria

        String senha = "AbdEdffG25";

        if(senha.equals("AbdEdffG25")){
            System.out.println("Parabens, voce acertou a senha!");
        }else{
            System.out.println("Parece que voce errou a senha!");
        }


        //podemos checar se tal item esta valido para desconto tambem 

        float descontoDez = 0.1f;
        float descontoVinte = 0.2f;

        float descontoItem;

        int precoItem = 150;

        if(precoItem > 200){
            descontoItem =  precoItem - (precoItem * descontoVinte);
            System.out.println("Aqui esta o item com desconto de 20%: " + descontoItem);
        }else if(precoItem >= 100 && precoItem <= 150){
            descontoItem = precoItem - (precoItem * descontoDez);
            System.out.println("Aqui esta o item com desconto de 10%: " + descontoItem);
        }else{
            System.out.println("Aqui esta o item sem desconto:" + precoItem);
        }


    }
    

    
}
