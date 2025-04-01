#include <stdio.h>


int main(){

    int i,j;
    char Letra;

    for(i =1; i <= 5; i++){
        Letra =  'A';
        for(j = 1; j <= i; j++){
            printf("%c", Letra);
            Letra++;
        }
        printf("\n");
    }

}