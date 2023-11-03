#include <iostream>
#include <vector>
#include <algorithm>
#include <functional>
#pragma warning(disable : 4996)
using namespace std;
 
int N;
vector<int> num_vec;
vector<int> answer_vec;
 
int is_find_before(int start, int end) {
    int sear_idx;
    for (sear_idx = start; sear_idx < end; sear_idx++) {
        if (num_vec.at(sear_idx) < num_vec.at(sear_idx + 1))
            answer_vec.at(sear_idx) = num_vec.at(sear_idx);
        else break;
    }
 
    if (sear_idx >= end) return 0;
 
    // we find descend sector
    int is_find_before_flag = is_find_before(sear_idx + 1, end);
 
    // there is no any descend sector
    if (is_find_before_flag == 0) {
        // 현재 인덱스 보다 한 칸 작은 놈을 선택 
        auto _iter = lower_bound(num_vec.begin() + sear_idx + 1 , num_vec.end(), num_vec.at(sear_idx));
        int one_small_index = _iter - num_vec.begin()-1;
        int one_small_value = num_vec.at(one_small_index);
        answer_vec.at(sear_idx) = num_vec.at(one_small_index);
 
        // 한 칸 작은 놈을 현재 위치에 넣어주고 나머지는 반대로 정렬해서 하나씩 넣어준다. 
        sort(num_vec.begin() + sear_idx + 1, num_vec.end(), greater<int>() );
 
        for (int new_idx = sear_idx + 1; new_idx <= end; new_idx++)
            if (one_small_value == num_vec.at(new_idx))
                answer_vec.at(new_idx) = num_vec.at(sear_idx);
            else
                answer_vec.at(new_idx) = num_vec.at(new_idx);
    }
 
    return 1;
}
 
int main() {
 
    scanf("%d", &N);
    num_vec.resize(N, 0);
    answer_vec.resize(N, 0);
 
    for (int n_idx = 0; n_idx < N; n_idx++)
        scanf("%d", &num_vec.at(n_idx));
 
    int is_get_answer = is_find_before(0, N - 1);
 
    if (!is_get_answer) {
        printf("-1");
        return 0;
    }
 
    for (int n_idx = 0; n_idx < N; n_idx++)
        printf("%d ", answer_vec.at(n_idx) ? answer_vec.at(n_idx) : num_vec.at(n_idx));
 
    return 0;
}
