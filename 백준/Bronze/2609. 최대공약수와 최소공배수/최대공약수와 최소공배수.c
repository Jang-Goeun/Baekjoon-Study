#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main(void)
{
	int A, B, i;
	
	scanf("%d %d", &A, &B);

	for (i = A;i > 0;i--) {
		if (A % i == 0 && B % i == 0) {
			printf("%d\n", i);
			break;
		}
	}

	for (i = 1;i < 10000;i++) {
		if ((A * i) % B == 0) {
			printf("%d\n", A * i);
			break;
		}
	}

	return 0;
}