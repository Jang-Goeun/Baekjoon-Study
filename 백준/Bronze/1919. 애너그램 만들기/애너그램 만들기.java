import java.util.Scanner;

public class Main  {
    public static int[] count(String str) {
        int[] count = new int[26];
        
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }
        
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        int[] a_count = count(a);
        int[] b_count = count(b);
        
        int ans = 0;
        for (int i = 0; i < 26; i++) {
            ans += Math.abs(a_count[i] - b_count[i]);
        }
        
        System.out.println(ans);
        sc.close();
    }
}