package EstruturaRepeticao;

public class Principal {
     public static void main(String[] args) {
        //vamos testar os loops 

        //temos 3 tipos de loops, for, while e do while

        //o loop for eh usado para quando sabemos quantas iteracoes desejamos realizar

        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }

        //o while eh bom para ser usado quando queremos verificar a condicao antes de executar o loop e quando nao sabemos o numero total de repeticoes

        int contador = 0;
        while(contador < 10){
            System.out.println(contador);
            contador++;
    }

      //e temos o do while que eh usado quando queremos que a iteracao seja realizada pelo menos uma vez, mesmo que a condicao seja falsa
       int saida = 1; //deixe em um, ou adicione um incrementador para nao transformar em loop infinito
       do{
        System.out.println("Teste");
       }while(saida != 1);
  } 
}
