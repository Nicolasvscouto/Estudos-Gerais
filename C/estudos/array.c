#include <stdio.h>
#include <stdlib.h>



int main(){
    int numero[5] = {10, 20, 30, 40, 50};


    for(int i=0; i < sizeof(numero) / sizeof(numero[0]); i++){
        printf("%d\n", numero[i]);
    }

    //soma de array



}