import java.util.Scanner;

public class InTheDreamContest1046 {
    //InTheDreamContest1046
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int firstHalfRiOI = a;
            int firstHalfKDOI = b;

            int secondHalfRiOI = c - a;
            int secondHalfKDOI = d - b;

            boolean firstHalfOk = Math.max(firstHalfRiOI, firstHalfKDOI ) <= 2 * Math.min(firstHalfRiOI, firstHalfKDOI) + 2;
            boolean secondHalfOk = Math.max(secondHalfRiOI, secondHalfKDOI) <=2 * Math.min(secondHalfRiOI, secondHalfKDOI) + 2;

            if (firstHalfOk && secondHalfOk) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            
           
        }
        sc.close();
    }
}
