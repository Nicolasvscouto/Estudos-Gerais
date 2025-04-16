#include <stdio.h>
#include <stdlib.h>


int main()
{
  int x, *ptr, **pptr;

  printf("Valor de X: %d\n", x);
  printf("Memoria de X: %x\n\n", &x);

  ptr = &x;
  pptr = &ptr;

  *ptr = *ptr + 10;

  printf("Valor de X: %d\n", x);
  printf("Valor do Ponteiro que aponta pra X: %d\n", *ptr);
  printf("Valor de Memoria do Ponteiro: %x\n\n", &ptr);

  **pptr = **pptr + 10;

  printf("Valor de X: %d\n", x);
  printf("Valor do Ponteiro que aponta pra X: %d\n", *pptr);
  printf("Valor de Memoria do Ponteiro: %x\n\n", &pptr);




  return 0;
}