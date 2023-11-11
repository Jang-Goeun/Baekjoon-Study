#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
void pick(int* list, int n, int* bucket, int bucketSize, int k) {
	int i, lastIndex, smallest, item;

	if (k == 0) {
		for (i = 0; i < bucketSize; i++)
			printf("%d ", list[bucket[i]]);
		printf("\n");
		return;
	}


	lastIndex = bucketSize - k - 1; // 가장 최근에 뽑힌 수가 저장된 위치 index

	if (bucketSize == k)
		smallest = 0;
	else
		smallest = bucket[lastIndex] + 1;

	for (item = smallest; item < n; item++) {
		bucket[lastIndex + 1] = item;
		pick(list, n, bucket, bucketSize, k - 1);
	}
}
int main(void)
{
	int k;
	int* S;
	int* bucket;

	scanf("%d", &k);

	while (k != 0) {
		S = (int*)malloc(sizeof(int) * k);
		bucket = (int*)malloc(sizeof(int) * 6);

		for (int i = 0; i < k;i++)
			scanf("%d", &S[i]);

		pick(S, k, bucket, 6, 6);

		printf("\n");

		free(S);
		free(bucket);

		scanf("%d", &k);
	}

	return 0;
}