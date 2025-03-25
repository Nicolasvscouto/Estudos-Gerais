#include <stdio.h>
 
int main() {
    int num;

    printf("Digite um numero: (Negativo para sair) ");
    scanf("%d", &num);

    while(num >= 0){
        printf("Voce Digitou esse numero: %d\n", num);

        printf("Digite um numero: (Negativo para sair)");
        scanf("%d", &num);
    
    }

    printf("Saindo...");
    return 0;
}