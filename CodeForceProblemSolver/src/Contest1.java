

import java.util.Scanner;

public class Contest1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Long A,B;
        A = sc.nextLong();
        B = sc.nextLong();
        
        Long result = A + B;

        System.out.println(result);
        
        sc.close();
    }
}
