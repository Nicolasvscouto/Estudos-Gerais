#include <stdio.h>


int main(){
    int numero[5];
    int soma = 0;

    for(int i=0; i < sizeof(numero) / sizeof(numero[0]); i++){
        numero[i] = i * 2;
        
    }


    // soma desse array agora


    for(int i = 0; i < sizeof(numero) / sizeof(numero[0]); i++){
        soma = soma + numero[i];
    }


    for(int i = 0; i < sizeof(numero) / sizeof(numero[0]); i++){
        printf("%d\n", numero[i]);
    }

    printf("%d\n", soma);



}