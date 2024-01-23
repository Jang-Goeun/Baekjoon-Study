import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int r_count = 0;
		int c_count = 0;
		String[] arr = new String[r];
		
		for(int i = 0; i < r; i++) {
			arr[i] = sc.next();
			
			if(arr[i].contains("X") == false)
				r_count++;
		}
		
		int count = 0;
		for(int i = 0; i < c; i++) {
			count = 0;
			for(int j = 0; j < r; j++){
			
				if(arr[j].charAt(i) == '.')
					count++;
			}
			if(count == r)
				c_count++;

		}
		
		int max = Math.max(r_count, c_count);
		System.out.println(max);
		sc.close();
	}

}
