import java.util.Scanner;

public class A_Spy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Test number: ");
        int test = sc.nextInt();

        boolean ok;

        for (int i = 0; i < test; i++) {
            System.out.print("Array size: ");
            int sizeOfArray = sc.nextInt();

            int[] arrayInt = new int[sizeOfArray];
            for (int j = 0; j < sizeOfArray; j++) {
                arrayInt[j] = sc.nextInt();

            }
            System.out.println("Index of the array: ");
            for (int j = 0; j < sizeOfArray; j++) {
                int count = 0;
                for (int k = 0; k < sizeOfArray; k++) {
                    if (arrayInt[j] == arrayInt[k]) {

                        count++;
                    }
                }

                if (count == 1) {
                    System.out.println(j + 1);
                    break;
                }
            }

        }

    }
}
