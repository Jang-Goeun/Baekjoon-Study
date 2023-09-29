#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
int main(void)
{
	int count, i, j, n, min, tmp;
	int* list;
	int* sort_list;

	scanf("%d", &count);   // n의 약수의 개수

	list = (int*)malloc(sizeof(int) * count);  // count 크기의 list배열 동적 할당

	for (i = 0;i < count;i++)    // list 배열에 n의 약수 대입
		scanf("%d", &list[i]);

	for (i = 0; i < count;i++) {
		for (j = i;j < count;j++) {
			if (list[j] < list[i]) {
				tmp = list[i];
				list[i] = list[j];
				list[j] = tmp;
			}
		}
	}

	//for (i = 0;i < count;i++)    // list 배열에 n의 약수 대입
	//	printf("%d ", list[i]);

	n = list[0] * list[count - 1];

	printf("%d", n);

	free(list);

	return 0;
}