#include <stdio.h>

int main(){
    for(int i = 100; i >= 0; i-= 10){
        if(i%2 == 0){
            printf("%d\n", i);
        }
    }

    return 0;
}
