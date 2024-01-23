import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int [] arr = new int[21];
		int count = 0;
		
		while(num > 0) {
			int number = sc.nextInt();
			for(int i = 0; i < 20; i++)
				arr[i] = sc.nextInt();

			for(int i = 0; i < 20; i++)
				for(int j = 0; j < i; j++) 
					if(arr[j] > arr[i]) {
						count++;
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
						i = j;
					}
			
			System.out.println(number + " " + count);
			num--;
			number++;
			count = 0;
		}
		
		sc.close();
	}

}
