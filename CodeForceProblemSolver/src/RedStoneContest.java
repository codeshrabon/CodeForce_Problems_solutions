import java.util.HashSet;
import java.util.Scanner;

public class RedStoneContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();   
        while (t-- > 0) {
            int n = sc.nextInt();
            HashSet<Integer> seen = new HashSet<>();
            boolean ok = (n == 1);
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (!ok && !seen.add(x)) {
                    ok = true; 
                }
            }
            System.out.println(ok ? "Yes" : "No");
        }
    }
}
