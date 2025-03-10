#include <stdio.h>


int main(){
    int idade = 12;
    char* resultado;

    
    resultado = (idade >= 18) ? "Maior de Idade" : "Menor de Idade";

    printf("Essa e sua idade: %s", resultado);
}