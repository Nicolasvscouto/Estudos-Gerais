#include <stdio.h>


int main(){
    int opcao, num1, num2, soma, subtracao;
    do{

        printf("Menu Interativo!\n");
        printf("1 - Somar\n");
        printf("2 - Subtrair\n");
        printf("3 - Sair do Sistema\n");
        scanf("%d", &opcao);

        system("cls");
        switch(opcao){
            case 1:
              printf("Digite o 1 numero: \n");
              scanf("%d", &num1);
              printf("Digite o 2 numero: \n");
              scanf("%d", &num2);
              soma = num1 + num2;
              printf("Esse e o resultado de sua soma: %d\n", soma);
              break;
            case 2:
              printf("Digite o 1 numero: \n");
              scanf("%d", &num1);
              printf("Digite o 2 numero: \n");
              scanf("%d", &num2);
              subtracao = num1 - num2;
              printf("Esse e o resultado de sua subtracao: %d\n", subtracao);
              break;
            case 3:
              printf("Saindo...");
              break;
            default:
              printf("Insira uma opcao valida, Por favor!\n");
              break;
        }
    }while(opcao != 3);

    return 0;
}