#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main(void)
{
	int n1, n2, num, num1;
	scanf("%d %d", &n1, &n2);

	num = n2;
	num1 = n2;

	while (num > 0)
	{
		num %= 10;
		printf("%d\n", n1 * num);
		num1 /= 10;
		num = num1;
	}

	printf("%d\n", n1 * n2);

	return 0;
}