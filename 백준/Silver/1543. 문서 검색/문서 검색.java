import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String key = sc.nextLine();
		String rep = "?";

		str = str.replace(key, rep);
		char[] arr = str.toCharArray(); 

		int count = 0;

		for(char c : arr)
			if(String.valueOf(c).equals(rep))
				count++;

		System.out.println(count);
		
		sc.close();
	}

}
