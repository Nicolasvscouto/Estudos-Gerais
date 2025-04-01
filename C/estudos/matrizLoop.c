#include <stdio.h>
#include <string.h>


#define LINHAS 2
#define COLUNAS 5

int main(){

    //atribuicao de valores utilizando loop aninhados

    int matriz1[3][3];

    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
            matriz1[i][j] = i + j;
        }
    }

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            printf("matriz[%d][%d] = %d\n", i, j, matriz1[i][j]);
        }
    }


    //agora vamos somar matrizes

    int matriz2[2][2] = {
        {1, 2},
        {2, 1}
    };

    int matriz3[2][2] = {
        {2, 2},
        {5, 9}
    };


    int matrizResultado[2][2];


    for(int i = 0; i < 2; i++){
        for(int j = 0; j < 2; j++){
            matrizResultado[i][j] = matriz2[i][j] + matriz3[i][j];
        }
    }

    for(int i = 0; i < 2; i++){
        for(int j = 0; j < 2; j++){
            printf("Matriz Resultado[%d][%d] = %d\n", i, j, matrizResultado[i][j]);
        }
    }  

    
    //matriz usando constante

    int matriz4 [LINHAS][COLUNAS];
    int soma = 0;



    for(int i = 0; i < LINHAS; i++){
        for(int j = 0; j < COLUNAS; j++){
            soma++;
            matriz4[i][j] = soma;
            printf("%d \n", matriz4[i][j]);
        }
        printf("\n");
    }






}