#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main(void)
{
	int n, len = 1, i = 0;
	long long  multiple;

	while (scanf("%d", &n) != EOF)
	{
		multiple = 0;
		len = 1;
		while (1) {
			multiple = (multiple % n) * 10 + 1;
			if (multiple % n == 0) {
				printf("%d\n", len);
				break;
			}
			len++;
		}
	}
	
	return 0;
}