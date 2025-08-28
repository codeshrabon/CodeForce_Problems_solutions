import java.util.Scanner;

public class TrippiTroppi {
    // TrippiTroppi
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        

        for (int i = 0; i < t; i++) {

            String one = sc.next();
            String two = sc.next();
            String three = sc.next();

            if (one.length() <= 10 && two.length() <= 10 && three.length() <= 10) {
                char oneCon = one.charAt(0);
                char twoCon = two.charAt(0);
                char threeCon = three.charAt(0);

                System.out.println("" + oneCon + twoCon + threeCon);
            }

        }

        sc.close();

    }
}
