//podemos utilizar um switch em uma verificacao aonde possui varios casos (melhor que fazer uma estrutura de decisao encadeada)

#include <stdio.h>

int main(){
    int valor = 1000; //comeca com um valor fixo de 1000 reais, porem pode ser alterado a qualquer momento
    int opcao, saque, deposito, total;

    printf("Ola. Seja bem-vindo ao banco. Que opcao voce deseja?\n");
    printf("1 - Sacar\n");
    printf("2 - Depositar\n");
    printf("3 - Visualizar saldo\n");
    scanf("%d", &opcao);

    switch(opcao){
      case 1:
       printf("Digite o quanto voce deseja sacar: ");
       scanf("%d", &saque);
       //vou adicionar aqui uma verificacao para evitar que ele saque um valor maior do que ele tem em saldo
       if(saque > valor){
         system("cls");
         printf("Voce nao possui a quantia necessaria para realizar esse saque.");
         break;
       }else{
         total = valor - saque;
         system("cls"); //adicionar um system clear para deixar a mensagem mais clara para o usuario
         printf("Voce sacou um total de: R$%d \nEsse o seu saldo em conta atual: R$%d", saque, total);
         break;
       }

      case 2:
       printf("Digite o quanto voce deseja depositar: ");
       scanf("%d", &deposito);
       total = valor + deposito;
       system("cls");
       printf("Voce depositou R$%d e ficou com um total de: R$%d", deposito, total);
       break;

      case 3:
       system("cls");
       printf("Seu saldo atual e de R$%d", valor);
       break;

      default:
       printf("Escolha uma opcao valida, por favor");
       break;
    }
}