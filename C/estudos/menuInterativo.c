#include <stdio.h>
#include <stdlib.h>
#include <time.h>


int main(){
    int opcao, numeroAleatorio, escolhido;

    printf("Menu Principal\n");
    printf("1 - Iniciar Jogo \n");
    printf("2 - Ver regras \n");
    printf("3 - Sair do Jogo \n");
    scanf("%d", &opcao);


    switch(opcao){
        case 1:
         system("cls");
         printf("Iniciando Jogo\n");
         srand(time(0));
         numeroAleatorio = rand() % 10;
         printf("OK. Vamos la. \nDigite um numero de 0 a 9: ");
         scanf("%d", &escolhido);
         /*utilizar uma estrutura de decisao aninhada para checar se duas coisas estao corretas
         1 - Ver se ele digitou um numero entre 0 e 9 (caso nao tenha de erro na hora)
         2 - Ver se ele acertou o numero secreto (mostrar o numero de qualquer jeito)
         */
         system("cls");
         if(escolhido < 0 || escolhido > 9){
            printf("Voce digitou um numero invalido.");
         }else{
            if(escolhido == numeroAleatorio){
                printf("Parabens, voce acertou o numero secreto. \nSeu Numero: %d \nNumero Secreto: %d", escolhido, numeroAleatorio);
            }else{
                printf("Infelizmente voce nao acertou o numero secreto. \nSeu Numero: %d \nNumero Secreto: %d", escolhido, numeroAleatorio);
            }
        }
         break;

        case 2:
        //isso aqui e meramente ilustrativo apenas pra utilizar exemplo de Switch dentro de outro switch
         system("cls"); //usar o system clean para limpar o menu interativo anterior e deixar apenas esse na tela para o usuario
         printf("Qual sessao das regras voce deseja ver?\n");
         printf("1 - Regras do Jogo\n");
         printf("2 - Termos\n");
         printf("3 - Copyright\n");
         scanf("%d", &opcao);
        //eu nao sei se isso esta correto ou se e uma boa pratica utilizar a mesma variavel novamente
         switch(opcao){
            case 1:
              system("cls");
              printf("As regras sao simples:  \n1 - Voce tem que adivinhar o numero\n2 - Voce NAO PODE escolher um numero acima de 9 ou abaixo de 0");
              break;

            case 2:
              system("cls");
              printf("Termos sao os seguintes: ....................."); 
              break;

            case 3:
              system("cls");
              printf("2020 - 2025 copyright");
              break;

            default:
              system("cls");
              printf("Opcao Invalida");
              break;
         }
         break;

        case 3:
         system("cls");
         printf("Saindo...");
         break;

        default:
         printf("Opcao Invalida");
         break;
    }
    return 0;
}