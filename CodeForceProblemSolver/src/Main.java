import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String w = sc.nextLine();
            int length = w.length();

            char fLatter = w.charAt(0);
            char lLatter = w.charAt(length - 1);

            if (length > 10) {

                System.out.println(fLatter + "" + (length - 2) + "" + lLatter);
            } else {
                System.out.println(w);
            }
        }

        sc.close();

    }
}
