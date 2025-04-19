package Exercicios;

public class estruturasRepeticao {
   public static void main(String[] args) {
    
    /*
     * O LOOP FOR EH RECOMENDADO PARA SER UTILIZADO QUANDO SABEMOS MAIS OU MENOS QUANDAS ITERACOES
     * HAVERAO.
     * 
     * JA O LOOP WHILE PODEMOS USA LO ATE QUE UMA CONDICAO SE TORNE FALSA (PODEMOS TER OU NAO TER NOCAO
     * DE QUANTAAS ITERACOES)
     * 
     * O LOOP DO WHILE EH OTIMO PARA QUEM DESEJA QUE A ITERACAO SEJA REALIZADA PELO MENOS UMA VEZ  
     */


     
    //vamos testar o for

    int [] vetor = {1,2,3,4,5,6,7,8,9,10};

    for(int i = 0; i < vetor.length; i++){
        System.out.printf("Vetor[%d] = %d\n", i, vetor[i]);
    }


   

    // agora vamos usar o mesmo vetor antes, mas utilizando o while para mostrar os numeros
    int size = 0;

    while(size < vetor.length){
        System.out.printf("Vetor[%d] = %d\n", size, vetor[size]);
        size++;
    }

    // agora a mesma coisa, porem, utilizando o do-while

    int size2 = 0;

    do{
        System.out.printf("Vetor[%d] = %d\n", size2, vetor[size2]);
        size2++;
    }while(size2 < vetor.length-1);

}


    
    
}
