import java.util.Scanner;

public class Training_Sheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X,Y;
        X = sc.nextInt();
        Y = sc.nextInt();

        int result = X * Y;
        System.out.println(result);

        sc.close();
    }
}
