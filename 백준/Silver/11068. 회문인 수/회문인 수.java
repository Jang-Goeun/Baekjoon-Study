import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

		for(int i = 0; i < N; i++){
			int check = 0;
			int data = Integer.parseInt(br.readLine());

			for(int j = 2; j <= 64; j++)
				if(logic(j, data) == 1) {
					check = 1;
					System.out.println(1);
					break;
				}
			
			if(check == 0)
				System.out.println(0);
		}
    }
	public static int logic(int B, int data){
		String str1 = "";

		List<Character> list = new ArrayList<>();
		while (data > 0) {
			char c;
			if (data % B < 10) {
				c = (char)(data % B + '0');
				list.add(c);
				str1 = str1 + c;
			}
			else{ // B가 10보다 큰 경우에 해당
				c = (char)(data % B - 10 + 'A');
				list.add(c); // 'A'는 10 다음의 값이므로 10을 뺀다.
				str1 = str1 + c;
			}

			data /= B;
		}

		String str2 = "";

		for (int j = list.size() - 1; j >= 0; j--)  // 거꾸로 출력
			str2 = str2 + list.get(j);

		if(str1.equals(str2))
			return 1;
		
		return 0;
	}
}