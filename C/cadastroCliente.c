#include <stdio.h>
#include <string.h>


char nome[20], escolha[10];
int senha, cpf;

void paginaLogin(){
    printf("Para realizar login. Digite o seu nome e senha:\n");
    printf("Nome:\n");
    fgets(nome, sizeof(nome), stdin);
    nome[strcspn(nome, "\n")] = 0;
    printf("Senha:");
    scanf("%d", &senha);
    //futuramente fazer um if-else para ver se o usuario realmente ta com o login certo ou nao
    //vamos fazer o if-else
    if(strcmp(nome, "Nicolas") == 0 && senha == 2020){
      printf("Parabens. \n Login: %s Senha: %d\n", nome, senha);
    }else{
        printf("Seu nome ou senha estao errados. Tente novamente");
    }
}

void paginaCadastro(){
    printf("Para realizarmos seu cadastro. Iremos precisar de algumas informacoes\n");
    printf("Qual seu nome?");
    fgets(nome, sizeof(nome), stdin);
    nome[strcspn(nome, "\n")] = 0; //remover o caracter da nova linha
    printf("Qual e seu cpf?");
    scanf("%d", &cpf);
    //talvez, no futuro quem sabe, eu faca uma decisao para ver caso o cpf ja seja cadastrado ou nao
    printf("Qual senha voce deseja:");
    scanf("%d", &senha);
}



int main(){
    printf("Olá. Seja bem-vindo ao nosso sistema de cadastro de clientes.\n");
    printf("Voce ja possui cadastro?");
    fgets(escolha, sizeof(escolha), stdin);
    //so limpar o caracter de escolha
    escolha[strcspn(escolha, "\n")] = 0;
    //vamos comecar fazendo a parte mais facil que e caso o usuario ja tenha login e apenas deve logar novamente
    if(strcmp(escolha, "sim") == 0){
        printf("Ok. Vamos leva-lo a area de login\n");
        paginaLogin();
      
    }else if(strcmp(escolha, "nao") == 0){ //agora a parte chata: Desenvolver todo sistema de cadastro
        printf("Ok. Vamos leva-lo a area de cadastro\n");
        paginaCadastro();
        printf("Parabens. Voce realizou o cadastro com sucesso!!\n");
        printf("Essas sao suas informacoes: \n Nome: %s \n Senha: %d \n CPF: %d \n Desde Ja. Obrigado por participar", nome, senha, cpf);
    }
  return 0;
}