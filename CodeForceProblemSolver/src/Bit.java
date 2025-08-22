import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 0;

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            String X = sc.nextLine();

            if (X.contains("++")) {
                x++;
            } else if (X.contains("--")) {
                x--;
            }

        }
        System.out.println(x);
        sc.close();
    }

}
