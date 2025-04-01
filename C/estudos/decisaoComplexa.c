#include <stdio.h>


int main(){

     /*
    for(int i = 0, j = 10; i <= j; i++, j--){
        printf("%d - %d\n", i, j);
    }
     */

     /*
     for(int i = 0, j = 10; i < 5 && j > 5; i++, j--){
        printf("%d - %d\n", i, j);
     }
     */


     /*
     for(int i = 0; i < 100; i+= (i%2 == 0) ? 1 : 2){
        printf("%d", i);
     }

     */

     //teste de break e continue

     for(int i = 0; i <= 10; i++){
        if(i == 5) continue;

        if(i == 8) break;
        printf("%d", i);
     }

     

     return 0;
    
}