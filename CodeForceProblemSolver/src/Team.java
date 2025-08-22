import java.util.Scanner;

public class Team {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        int countSolution = 0;

        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            int v = sc.nextInt();
            int t = sc.nextInt();

            /*
             * //One solution
             * int twoFriend = p+v+t;
             * if (twoFriend>=2) {
             * countSolution++;
             * }
             */
            if ((p == 1 && v == 1) || (p == 1 && t == 1) || (v == 1 && t == 1)) {
                
                    countSolution++;
                

            }
            

        }
        System.out.println(countSolution);
        sc.close();

    }
}