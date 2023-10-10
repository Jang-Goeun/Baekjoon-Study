#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int N[1000001] = { 0 };
int main(void)
{
	int i, j, num, check;

	N[1] += 1;

	for (i = 2;i < 1000000;i++) {
		for (j = 2;j * i <= 1000000;j++)
			N[j * i] += 1;
	}

	scanf("%d", &num);
	
	do
	{
		for (i = 3;i < 1000000;i++) {
			if (N[i] == 0) {
				check = num - i;
				if (N[check] == 0) {
					printf("%d = %d + %d\n", num, i, check);
					break;
				}
			}
		}

		scanf("%d", &num);
	} while (num != 0);

	return 0;
}