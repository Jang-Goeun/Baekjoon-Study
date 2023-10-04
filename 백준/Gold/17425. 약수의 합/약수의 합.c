#include <stdio.h>

#define MAX_INPUT 1000000

int main()
{
    int T, N;
    long long sum_of_div[MAX_INPUT + 1] = {0};

    for(int i = 1; i <= MAX_INPUT; i++){ //g(x)를 구하는 식
        for(int j = 1; i * j <= MAX_INPUT; j++){
            sum_of_div[i * j] += i;  //i를 약수로 가지는 수들에게 i를 더해줌
        }
        sum_of_div[i] += sum_of_div[i - 1]; //g(x)를 만들어주는 부분. 이 부분이 없다면 f(x)만 구하게 됨.
    }

    scanf("%d", &T);

    while(T--) {
        scanf("%d", &N);

        printf("%lld\n", sum_of_div[N]);
    }
    
    return 0;
}