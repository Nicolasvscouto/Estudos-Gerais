//operadores logicos

//and (&&)
//or (||)

#include <stdio.h>


int main(){
    int idade, renda;


    printf("Escreva sua idade");
    scanf("%d", &idade);

    printf("Escreva sua renda");
    scanf("%d", &renda);

    if(idade > 18 || idade >= 60){
        if(renda < 2000){
            printf("Voce tem direito ao desconto");
        }else{
            printf("Sua renda e muito alta. Voce nao tem direito ao desconto");
        }
    }else{
        printf("Voce nao tem idade suficiente");
    }

    return 0;
}