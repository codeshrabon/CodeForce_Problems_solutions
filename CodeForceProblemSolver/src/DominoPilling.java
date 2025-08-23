import java.util.Scanner;

public class DominoPilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M, N ;
        M = sc.nextInt();
        N = sc.nextInt();

        int totalArea = M * N;

        // with this i can find the total squire in side the rectangle 

        // int totalSquires=0;
        // int temp = 0;
        
        // for(int i = 1; i <= M; i++ ){
            
        //     temp = (M - i + 1) * (N - i + 1);
        //     totalSquires += temp;
        
        
        // }
        // System.out.println(totalSquires);

        int totalRectangleFits = totalArea/2;
        System.out.println(totalRectangleFits);


        sc.close();
        
    }
}
