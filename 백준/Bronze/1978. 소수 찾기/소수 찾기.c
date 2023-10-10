#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main(void)
{
	int N, num, i, j, count = 0, check;

	scanf("%d", &N);

	for (i = 0;i < N;i++) {
		check = 1;
		scanf("%d", &num);

		if (num == 1)
			check = 0;
		else {
			for (j = 2;j < num;j++) {
				if (num % j == 0) {
					check = 0;
					break;
				}
			}
		}

		if (check == 1)
			count++;
	}

	printf("%d", count);

	return 0;
}