#include <stdio.h>
#include <stdlib.h>
#include <time.h>


int main(){
    int numeroAleatorio, numeroUsuario, opcao;
    srand(time(NULL));
    numeroAleatorio = rand() % 10 + 1;

    printf("Bem-vindo ao jogo da comparacao.\n");
    printf("Qual tipo de comparacao voce deseja realizar?\n");
    printf("1 - Maior\n");
    printf("2 - Menor\n");
    printf("3 - Igual\n");
    scanf("%d", &opcao);

    system("cls");
    switch(opcao){
        case 1:
          printf("Digite o seu numero entre 1 a 10: ");
          scanf("%d", &numeroUsuario); 
          if(numeroUsuario < 0 || numeroUsuario > 10){
             printf("Entrada de dados invalida, tente novamente!");
          }else{
             printf("Escolha do Computador: %d\n", numeroAleatorio);
             printf("Sua Escolha: %d\n", numeroUsuario);
             printf(numeroUsuario > numeroAleatorio ? "Parabens, Voce venceu" : "Infelizmente voce perdeu");
          }
          break;

        case 2:
          printf("Digite o seu numero entre 1 a 10: ");
          scanf("%d", &numeroUsuario);
          if(numeroUsuario < 0 || numeroUsuario > 10){
             printf("Entrada de Dados invalida, tente novamente!");
          }else{
             printf("Escolha do Computador: %d\n", numeroAleatorio);
             printf("Sua escolha: %d\n", numeroUsuario);
             printf(numeroAleatorio > numeroUsuario ? "Parabens, Voce venceu" : "Infelizmente Voce Perdeu");
          }
          break;

        case 3:
          printf("Digite o seu numero entre 1 a 10: ");
          scanf("%d", &numeroUsuario);
          if(numeroUsuario < 0 || numeroUsuario > 10){
             printf("Entrada de Dados invalida, tente novamente!");
          }else{
             printf("Escolha do Computador: %d\n", numeroAleatorio);
             printf("Sua escolha: %d\n", numeroUsuario);
             printf(numeroAleatorio == numeroUsuario ? "Parabens, Voce venceu" : "Infelizmente Voce Perdeu");
          }
         break;
        
        default:
         printf("Selecione uma opcao valida, por favor!");
         break;
    }


return 0;

}