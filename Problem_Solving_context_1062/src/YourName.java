import java.util.Arrays;
import java.util.Scanner;

public class YourName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int initialLength;

        int operationStep = sc.nextInt();
        sc.nextLine();

        String initialName;

        String cubeOfLetters;

        

        while (operationStep-- > 0) {

            // intial length
            initialLength = sc.nextInt();
            
            sc.nextLine();

            // initial name
            initialName = sc.next();

            initialName = initialName.toLowerCase();
            

            // cube letters
            cubeOfLetters = sc.next();
            cubeOfLetters = cubeOfLetters.toLowerCase();

            int lenghtOfInitialName = initialName.length();
            int lenghtOfCubeLetter = cubeOfLetters.length();

            if (lenghtOfInitialName != initialLength || lenghtOfInitialName != lenghtOfCubeLetter) {
                System.out.println("No");
            } else {

                // to check individual char to initial name and cube letter

                char[] cInitialName = initialName.toCharArray();
                char[] cCubeOfLetters = cubeOfLetters.toCharArray();

                Arrays.sort(cInitialName);
                Arrays.sort(cCubeOfLetters);



                if (Arrays.equals(cInitialName, cCubeOfLetters)) {
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }

            }

            // for (int i = 0; i < initialLength; i++) {
            // cubeOfLatter = sc.nextLine();
            // System.out.println("Enter cube latter: " + cubeOfLatter);
            // }
            

        }
        sc.close();
    }
}
