#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main(void)
{
	int n, b, i;
	long long int x, a;
	long long int total_money = 0;

	scanf("%lld", &x);
	scanf("%d", &n);

	for (i = 0; i < n;i++) {
		scanf("%lld %d", &a, &b);
		total_money += a * (long long)b;
	}

	if (x == total_money)
		printf("Yes");
	else
		printf("No");

	return 0;
}