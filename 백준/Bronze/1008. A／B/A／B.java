// 장고은 2024-02-09 P1008 A/B를 출력하는 프로그램

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		double A = Integer.parseInt(st.nextToken());
		double B = Integer.parseInt(st.nextToken());

		double div = A / B;

		System.out. println(div);
	}

}
