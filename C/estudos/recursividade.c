#include <stdio.h>

void recursivo(int n){
    if(n > 0){
        printf("%d\n", n);
    }
    recursivo(n - 1);
}


int main(){
    int numero = 20;
    recursivo(numero);
}