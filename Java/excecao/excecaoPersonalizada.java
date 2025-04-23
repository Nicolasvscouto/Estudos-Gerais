package excecao;

public class excecaoPersonalizada{
    public static void main(String [] args){
        try{
            int resultado = divisao(10, 0);
            System.out.println("Resultado" + resultado);
        }catch(excecaoPersonalizadaDivisaoPorZero e){
            System.out.println("ERRO:" + e.getMessage());
        } 

    }



    public static int divisao(int dividendo, int divisor) 
                                   throws excecaoPersonalizadaDivisaoPorZero{
        if (divisor == 0){
            throw new excecaoPersonalizadaDivisaoPorZero("O divisor nao pode ser zero!");
        }
        return dividendo / divisor;
    }



     public static class excecaoPersonalizadaDivisaoPorZero extends Exception{
        public excecaoPersonalizadaDivisaoPorZero(String mensagem){
            super(mensagem);
        }
    }
}