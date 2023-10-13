#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int check = 0;
void sort(int* bucket, int *list)
{
	int i, j, tmp, min;

	for (i = 0;i < 7;i++) {
		min = list[bucket[i]];
		for (j = i + 1;j < 7;j++) {
			if (list[bucket[j]] < min) {
				tmp = min;
				min = list[bucket[j]];
				list[bucket[j]] = tmp;
			}
		}
		list[bucket[i]] = min;
	}
}
void pick(int n, int* list, int* bucket, int bucketSize, int k) {
	int i, lastIndex, smallest, item, sum = 0;
	if (k == 0) {
		for (i = 0; i < bucketSize; i++) {
			sum += list[bucket[i]];
		}
		
		if (sum == 100) {
			sort(bucket, list);
			for (i = 0; i < bucketSize; i++)
				printf("%d\n", list[bucket[i]]);
			check = 1;
		}
		return;
	}
	lastIndex = bucketSize - k - 1; // 가장 최근에 뽑힌 수가 저장된 위치 index
	if (bucketSize == k)
		smallest = 0;
	else
		smallest = bucket[lastIndex] + 1;

	for (item = smallest; item < n; item++) {
		if (check == 1)
			return;
		bucket[lastIndex + 1] = item;
		pick(n, list, bucket, bucketSize, k - 1);
	}
}
int main(void)
{
	int n = 9, i;
	int bucket[9], new_bucket[7];

	for (i = 0;i < 9;i++) 
		scanf("%d", &bucket[i]);

	pick(n, bucket, new_bucket, 7, 7);
}