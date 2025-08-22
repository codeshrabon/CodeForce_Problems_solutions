import java.util.Scanner;

public class SizeOfTheBox {
    public static void main(String[] args) {
        // each box size it fixed

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        

        

        int[] boxSize = new int[N];
        for(int i = 0; i < N; i++){
            boxSize[i] = sc.nextInt();
        }

        if (N >= 3) {
            int position = 3;
        int thresholdBoxPosition = boxSize[position-1];
        for(int i = 0; i < N; i++){
            if (boxSize[i] == thresholdBoxPosition ) {
                System.out.println(boxSize[i]);
            }
        }
        }
        
        sc.close();
        

    }
}
