//영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		char[] arr = str.toCharArray();
		
		for (int i = 0; i< arr.length; i++) {
			char c = arr[i];
			if(Character.isUpperCase(c))
				System.out.print(String.valueOf(c).toLowerCase());
			else
				System.out.print(String.valueOf(c).toUpperCase());
		}
		
		sc.close();
	}

}
