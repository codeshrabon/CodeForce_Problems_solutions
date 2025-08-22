import java.util.Scanner;

public class Next_Round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n,k;
        n = sc.nextInt();
        k = sc.nextInt();
        sc.nextLine();

        int[] score = new int[n];
        for(int i = 0; i < n ; i++){
            score[i] = sc.nextInt();
        }

        int thresholdScore  = score[k-1];
        int count = 0;
        for(int i = 0; i < n; i++){
            if (score[i] >= thresholdScore  && score[i] > 0) {
                count++;
            }
        }
        System.out.println(count);

        sc.close();
    }
    
}
