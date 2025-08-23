import java.util.Scanner;

public class FreelamcherWork {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N,P;
        N = sc.nextInt();
        P = sc.nextInt();
        int companyGet =(int) (P * 0.2);
        int profit = P - companyGet;
        
        int totalPercentage = 0;

        for(int i = 0; i < N; i++){
           
            totalPercentage += profit;
        }
        System.out.println(totalPercentage);

        sc.close();


    }
}
