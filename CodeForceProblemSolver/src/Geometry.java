import java.util.Scanner;

public class Geometry {
    //Geometry
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int B = sc.nextInt(); 
        int A = sc.nextInt(); 
        B = 2*A;
        double pi = 3.14159265359;
        double area = (pi * A * A) / 2.0;

        //double redArea = (A * 1.0 * A) * (1.5 - pi / 2.0);
        double redArea = (B * 1.0 * B) * (3.0 - pi) / 8.0;

        System.out.printf("%.9f\n", redArea);

                sc.close();
    }
}
