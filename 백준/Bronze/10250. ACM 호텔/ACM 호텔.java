import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		while(T > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int H = Integer.parseInt(st.nextToken()); // 층
			int W = Integer.parseInt(st.nextToken()); // 한 층에 있는 방 개수
			int N = Integer.parseInt(st.nextToken()); // N번째 손님
			int room = 0, check = 1, check2 = 0;;

			for (int i = 1; i <= W; i++) {
				for (int j = 1; j <= H; j++) {
					room = j * 100 + i;

					if(check == N){
						check2 = 1;
						break;
					}

					check++;
				}

				if(check2 == 1)
					break;
			}
			
			System.out.println(room);
			T--;
		}
	}

}
