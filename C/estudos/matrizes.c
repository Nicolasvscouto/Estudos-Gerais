#include <stdio.h>



int main(){
    int index;
    char * Alunos[3][3] = {
        {"Aluno 0", "Portugues: 7", "Matematica: 9"},
        {"Aluno 1", "Portugues: 4", "Matematica: 6"},
        {"Aluno 2", "Portugues: 10", "Matematica: 10"}
    };

    printf("Ola. Seja bem-vindo ao sistema de notas! Escolha um aluno\n");
    printf("Aluno 0 - Digite 0\n");
    printf("Aluno 1 - Digite 1\n");
    printf("Aluno 2 - Digite 2\n");
    scanf("%d", &index);

    printf("Aqui esta as notas do %s: %s, %s...", Alunos[index][0], Alunos[index][1], Alunos[index][2]);


   


   

}