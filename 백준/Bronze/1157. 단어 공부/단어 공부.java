import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next(); 
		
		sc.close();

		int len = str.length(); 
		
		int max = 0, arr_num = 0, count = 0; 
		char alp_arr[] = new char[26]; 
		
		for(int i=0;i<len;i++) {
			int num = str.charAt(i) - 65; 
			
			if(num>=32 && num<=57)  
				num -= 32;			
					
			alp_arr[num] += 1; 
		}
		
		for(int i=0;i<alp_arr.length;i++) {
			if(alp_arr[i]>max) { 
				max = alp_arr[i]; 
				arr_num = i;
			}
		}
		
		for(int i=0;i<alp_arr.length;i++) {
			if(max == alp_arr[i]) { 
				count++;	
			}
		}
		
		if(count>=2) { 
			System.out.println('?');
		}else { 
			System.out.println((char)(arr_num+65));
		}
		sc.close();
	}
}