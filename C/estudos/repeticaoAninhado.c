#include <stdio.h>

int main(){
    //Exemplo usando For

    /*
    for(int i=1; i <= 10; i++){
        for(int j=1; j <= 10; j++){
            printf("%d\n", j * i);
        }
    }
    */


    //Exemplo agora usando While
   /*
    int f = 1;
        while(f <= 10){
            int h = 1;
        while(h <= 10){
            printf("%d\n", f * h);
            h++;
        }
        f++;
    }
   */


    //exemplo agora usando do-while
    /*
    int x = 1;
    do{
        int a = 1;
        do{
            printf("%d\n", x * a);
            a++;
        }while(a <= 10);
        x++;
    }while(x <= 10);
    */

    //Exemplos extras

    //verificar soma de numeros pares

    /*
    for(int i = 1; i <= 5; i++){
        for(int j = 1; j <= 5; j++){
            if((j + i)%2 == 0){
                printf("(%d, %d)\n", i, j);
            }
        }
    }
    */


    //criacao de um triangulo usando astericos


    /*
    int n = 5;
    for(int i=1; i <= n; i++){
        for(int j=1; j  <= i; j++){
            printf("*");
        }
        printf("\n");
    }

    */

    //contagem regressiva fogos


    /*
    int segundos;

    for(segundos = 10; segundos >= 0; segundos--){
        printf("%d\n", segundos);

        for(int i = 0; i < 100000000; i++){

        }
    }


    printf("Fogos!!!!");
    */

    //tabuada com loop For

    for(int i= 1; i<= 10; i++){
        for(int j=1; j<=10; j++){
            printf("%d x %d = %d\n", i, j, i * j);
        }
        printf("\n");
    }

 
    return 0;
}