#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int N[1000001] = { 0 };
int main(void)
{
	int n, m, i, j;

	scanf("%d %d", &m, &n);

	N[1] += 1;

	for (i = 2;i < n;i++) {
		for (j = 2;j * i <= n;j++)
			N[j * i] += 1;
	}

	for (i = m;i <= n;i++)
		if (N[i] == 0)
			printf("%d\n", i);

	return 0;
}