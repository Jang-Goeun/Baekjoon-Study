//2024.01.18 장고은 백준 13223번(소금 폭탄)
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String se = ":";
		String p_time = sc.next();
		String r_time = sc.next();

		if(p_time.equals(r_time))
			System.out.println("24:00:00");
		else{
			String[] p_time_arr = p_time.split(se);
			String[] r_time_arr = r_time.split(se);

			int t_result = 0;
			int h_result = 0;
			int s_result = 0;

			s_result = Integer.parseInt(r_time_arr[2]) - Integer.parseInt(p_time_arr[2]);
			if(s_result < 0){
				h_result--;
				s_result = 60 + s_result;
			}

			h_result += Integer.parseInt(r_time_arr[1]) - Integer.parseInt(p_time_arr[1]);
			if(h_result < 0){
				t_result--;
				h_result = 60 + h_result;
			}

			t_result += Integer.parseInt(r_time_arr[0]) - Integer.parseInt(p_time_arr[0]);
			if(t_result < 0)
				t_result = 24 + t_result;

			if(t_result >= 10 && h_result >= 10 && s_result >= 10)
				System.out.println(t_result + ":" + h_result + ":" + s_result);
			else{
				String t, h, s;

				if(t_result < 10)
					t = String.format("%02d", t_result);
				else
					t = String.valueOf(t_result);

				if(h_result < 10)
					h = String.format("%02d", h_result);
				else
					h = String.valueOf(h_result);

				if(s_result < 10)
					s = String.format("%02d", s_result);
				else
					s = String.valueOf(s_result);

				System.out.println(t + ":" + h + ":" + s);
			}
		}
		sc.close();
	}

}
