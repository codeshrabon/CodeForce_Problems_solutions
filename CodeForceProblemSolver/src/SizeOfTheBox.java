import java.util.Scanner;

public class SizeOfTheBox {
    public static void main(String[] args) {
        // each box size it fixed

        Scanner sc = new Scanner(System.in);

        String N = sc.nextLine();
        
        
            int position = 3;
            char threshholdBoxPosition = N.charAt(position -1);
            int converInt = Character.getNumericValue(threshholdBoxPosition);
            if (converInt > 0) {
                System.out.println(converInt);
            }

        
            
        

        


        
        sc.close();
        

    }
}
