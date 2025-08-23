import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // each box size it fixed

        Scanner sc = new Scanner(System.in);

        String N = sc.nextLine();
        
        
            int position = 3;
            char threshholdBoxPosition = N.charAt(N.length() - position);
            int convertInt = Character.getNumericValue(threshholdBoxPosition);
            if (convertInt > 0) {
                System.out.println(convertInt);
            }

        
            
        

        


        
        sc.close();
        

    }
}
