import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] count = new int[10001];

        // 각 수의 등장 횟수를 count 배열에 저장
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            count[num]++;
        }

        // StringBuilder를 사용하여 출력 -> 여러번 System.~가 사용되는 것 방지
        
        for (int i = 1; i <= 10000; i++) {
            while (count[i] > 0) {
                bw.write(Integer.toString(i));
                bw.newLine();
                count[i]--;
            }
        }

		bw.flush();
        bw.close();
    }
}