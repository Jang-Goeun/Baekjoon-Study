import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] arr = new int[50];
		int sum = 2; // 맨 밑 줄
		arr[0] = 1;

		// 1, 3, 6, 10, ... 등차 수열 저장
		for(int i=1; i<arr.length; i++) {
			arr[i] = arr[i-1] + sum;
			sum ++;
		}
		
		// 3 ~ 1000 까지 3개의 합으로 표현가능한 수 저장
		boolean[] check = new boolean[1001];
		
		// check[] 배열에 3~1000까지 수 중 3개의 합으로 나타낼 수 있으면 true
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				for(int k = 0; k < arr.length; k++) {
					int index = arr[i] + arr[j] + arr[k];
					if(index > 1000)
						continue;	
					check[index] = true;
				}
			}
		}
		
		for(int i = 0; i < T; i++) {
			int num = sc.nextInt();
			if(check[num])
				System.out.println("1");
			else
				System.out.println("0");
		}
		
		sc.close();
	}

}
