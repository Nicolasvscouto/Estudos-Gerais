#include <stdio.h>
#include <stdlib.h>
#include <time.h>


int main(){
    int escolhaUsuario, escolhaComputador;
    srand(time(NULL));
    escolhaComputador = rand() % 3 + 1;

    printf("Voce esta num Pedra Papel Tesoura. Escolha sua opcao: ");
    printf("\n1- Pedra");
    printf("\n2- Papel");
    printf("\n3- Tesoura\n");
    scanf("%d", &escolhaUsuario);

    system("cls");
    switch(escolhaUsuario){
        case 1:
         printf("Usuario escolheu Pedra\n");
         break;
        case 2:
         printf("Usuario escolheu Papel\n");
         break;
        case 3:
         printf("Usuario escolheu Tesoura\n");
         break;
        default:
         printf("Usuario nao escolheu uma opcao valida\n");
         break;
    }

    switch(escolhaComputador){
        case 1:
         printf("Computador escolheu Pedra\n");
         break;
        case 2:
         printf("Computador escolheu Papel\n");
         break;
        case 3:
         printf("Computador escolheu Tesoura\n");
         break;
    }

    if(escolhaUsuario == escolhaComputador){
        printf("Houve um Empate!");
    }else if((escolhaUsuario == 1) && (escolhaComputador == 3)||
             (escolhaUsuario == 2) && (escolhaComputador == 1)||
             (escolhaUsuario == 3) && (escolhaComputador == 2)){
                printf("Parabens, voce ganhou!!!\n");
             }else{
                printf("Infelizmente, voce perdeu :(\n");
             }


return 0;
}