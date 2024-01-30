import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        List<Character> list = new ArrayList<>();
        while (N > 0) {
            if (N % B < 10) {
                list.add((char) (N % B + '0'));
            }
            else{ // B가 10보다 큰 경우에 해당
                list.add((char) (N % B - 10 + 'A')); // 'A'는 10 다음의 값이므로 10을 뺀다.
            }

            N /= B;
        }

        for (int i = list.size() - 1; i >= 0; i--)  // 거꾸로 출력
            System.out.print(list.get(i));
    }
}