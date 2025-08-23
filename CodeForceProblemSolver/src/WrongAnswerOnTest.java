import java.util.Scanner;

public class WrongAnswerOnTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A,B,C,D;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        
        double result = (double) (A * B + C)/D;
        System.out.printf("%.9f", result);

        sc.close();
    }
}
