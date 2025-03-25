#include <stdio.h>
#include <string.h>


int main(){
    int opcao;
    float nota1, nota2, media;
    printf("Bem vindo ao programa da Escola. Escolha uma opcao\n");
    printf("1- Calcular Media\n");
    printf("2- Ver sua Situacao\n");
    printf("3- Sair do Programa\n");
    scanf("%d", &opcao);

    switch(opcao){
        case 1:
         system("cls");
         printf("--- Calculando Media ---\n");
         printf("Digite a primeira nota: ");
         scanf("%d", &nota1);
         printf("Digite a segunda nota: ");
         scanf("%d", &nota2);
         if((nota1 >= 0 && nota1 <= 10) && (nota2 >= 0 && nota2 <= 10)){
            media = (nota1 + nota2) / 2;
            printf("Aqui esta sua media: %.1f", media);
         }else{
            printf("Valores de nota invalidos, tente novamente");
         }
         break;

        case 2:
         system("cls");
         printf("--- Verificando Situacao ---\n");
         printf("Qual e sua Media? ");
         scanf("%d", &media);
         if(media < 0 || media > 10){
          printf("Entrada invalida de dados");
         }else{
          if(media < 5){
              printf("Reprovado");
          }else if(media >=5  && media < 7){
              printf("Recuperacao");
          }else{
              printf("Aprovado");
          }}
          break;

        case 3:
          system("cls");
          printf("Saindo do Programa...");
          break;

        default:
          system("cls");
          printf("Escolha uma opcao valida");
          break;
    }




}

