import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A,B;

        

        B = sc.nextInt();
        A = sc.nextInt();

        double rectangleArea = (double) A * B;

        double radius = A / 2.0;
        double twoCircleArea  = 2 * Math.PI * radius * radius;
        double triangleAre = (A * A) / 2.0;

        double redArea = rectangleArea - (twoCircleArea+ triangleAre);

        System.out.printf("%.6f", redArea);

        sc.close();
    }
}
