#include <stdio.h>
#include <stdlib.h>
#include <time.h>


int main(){
    int comprimento;
    char senha[100]; // Ajuste o tamanho conforme necessário
    char caracteres[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+";
    int tamanhoCaracteres = sizeof(caracteres) - 1;

    printf("Digite o comprimento da senha: ");
    scanf("%d", &comprimento);

    srand(time(NULL)); // Inicializa o gerador de números aleatórios

    for (int i = 0; i < comprimento; i++) {
        senha[i] = caracteres[rand() % tamanhoCaracteres];
    }
    senha[comprimento] = '\0'; // Adiciona o caractere nulo no final da string

    printf("Senha gerada: %s\n", senha);

    return 0;

}