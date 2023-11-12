#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#define min(A,B) A<B?A:B
int a[1000001];
int main(void)
{
	int x;

	scanf("%d", &x);

    for (int i = 2; i <= x; i++) {
        a[i] = a[i - 1] + 1;

        if (i % 3 == 0)
            a[i] = min(a[i], a[i / 3] + 1);

        if (i % 2 == 0)
            a[i] = min(a[i], a[i / 2] + 1);
    }

    printf("%d", a[x]);
    
    return 0;
}