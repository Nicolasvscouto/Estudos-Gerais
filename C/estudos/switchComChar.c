#include <stdio.h>

//exemplo bem simples mas para ficar recordado de como fazer

int main(){
    char opcaoChar;
    int soma, subtracao;
    int num1 = 20, num2 = 10;

    printf("Escolha uma opcao valida: ");
    scanf(" %c", &opcaoChar);
    switch(opcaoChar){
      case 's':
      case 'S':
        soma = num1 + num2;
        printf("Aqui esta sua soma: %d", soma);
        break;

      case 'd':
      case 'D':
        subtracao = num1 - num2;
        printf("Aqui ssta sua subtracao: %d", subtracao);
        break;
        
      default: 
        printf("Escolha uma opcao valida");
        break;
    }
}