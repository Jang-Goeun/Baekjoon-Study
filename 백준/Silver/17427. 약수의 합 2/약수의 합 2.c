#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
long long h(int n)
{
	int i;
	long long hab = 0;

	for (i = 1; i <= n; i++) 
		hab += (n / i) * i;

	return hab;
}
int main(void)
{
	int n;

	scanf("%d", &n);
	printf("%lld", h(n));

	return 0;
}