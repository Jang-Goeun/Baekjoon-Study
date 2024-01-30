import java.io.*;
import java.util.*;

public class Main {
	static int N, X, count;
	static int[] data;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
        data = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());

		for(int i = 0; i < N; i++)
			data[i] = Integer.parseInt(st.nextToken());

		X = Integer.parseInt(br.readLine());

		logic(data);
	}
    public static void logic(int[] arr) {
        Arrays.sort(arr);
		
        int L = 0;
        int R = N - 1;

        while (L < R) {
            int mid = arr[L] + arr[R];

            if (mid == X) {
                count++;
                R--;
                L++;
            } else if (mid > X) {
                R = R - 1;
            } else {
                L = L + 1;
            }
        }
        System.out.println(count);
    }
}
