//CALCULADORA EM C

#include <stdio.h>
#include <string.h>
#include <math.h>

int num1, num2, numEscolha, resultado; 


void pedirNumeros(){
    system("cls"); 
    printf("Digite o primeiro numero: ");
    scanf("%d", &num1);
    printf("Digite o segundo numero: ");
    scanf("%d", &num2);
}

int adicao(num1, num2){ 
    return num1 + num2;
}

int subtracao(num1, num2){ 
    return num1 - num2;
}

int multiplicacao(num1, num2){
    return num1 * num2;
}

float divisao(int num1, int num2){
    if(num2 == 0){
        return NAN;
    }else{
        return (float) num1 / (float) num2;
    }

}

float potenciacao(num1, num2){
    return pow(num1, num2); //nao sei como caralhos pow funciona mas e isso ae
}



/*
a variavel TEST (no main) e a variavel que mantem o loop ativo, por isso ela ja esta inicializada com o valor verdadeiro no comeco
porque, dessa forma, o loop ja e ativado e so e quebrado quando o usuario completa alguma operacao matematica ou desliga a calculadora.

Utilizar mais System Clear para deixar mais bonito oq e mostrado para o usuario.

qualquer variavel que for ser utilizada no main e, em alguma outra funcao, deve ser 

tive que criar uma nova variavel para exibir o resultado da divisao (nao sei resolver por enquanto)

coisas para melhorar: tratamento de erros para verificar se o num escolha e realmente um numero e nao um caracter (mesma coisa com num1 e num2)
*/


int main(){
    int test = 1; 
    printf("Ola. Seja bem-vindo a calculadora!\n Qual calculo voce deseja?\n");
    while(test){
     printf(" 1 - Adicao \n 2 - Subtracao \n 3 - Multiplicacao \n 4 - Divisao \n 5 - Potenciacao\n");
     printf("(Caso queira desligar a calculadora. Aperte 0)\n");
     scanf("%d", &numEscolha);
     switch(numEscolha){
        case 1:
         pedirNumeros();
         resultado = adicao(num1, num2); 
         printf("Esse e o resultado: %d", resultado);
         test = 0;
         break;
        case 2:
         pedirNumeros();
         resultado = subtracao(num1, num2);
         if(resultado < 0){
           printf("Sua conta deu negativo. \nEssa e a resposta da sua subtracao: %d", resultado);
           test = 0;
         }else{
           printf("Esse e o resultado da sua subtracao: %d", resultado);
           test = 0;
         }
         break;
        case 3:
         pedirNumeros();
         resultado = multiplicacao(num1, num2);
         printf("Esse e o resultado de sua multiplicacao: %d", resultado);
         test = 0;
         break;
        case 4:
         pedirNumeros();
         float resultado2 = divisao(num1, num2);
         if(isnan(resultado2)){
            printf("Nao e possivel realizar divisao com zero!\n Tente novamente!\n");
            test = 1;
         }else{
            printf("Essa e a resposta da sua divisao: %.2f", resultado2);
            test = 0;
         }
         break;
        case 5:
         pedirNumeros();
         resultado2 = potenciacao(num1, num2);
         printf("Esse e o resultado de sua potenciacao: %.2f", resultado2);
         test = 0;
         break; 
        case 0:
         printf("Desligando....");
         return 0;
        default:
         system("cls");
         printf("Opcao Invalida. Tente novamente!");
         test = 1;
         break;
    }
  } 
  return 0;
}