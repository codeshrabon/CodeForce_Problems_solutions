import java.util.Scanner;

public class CreateNewName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        sc.hasNextLine();
        
        String T = sc.nextLine();
        
        

        System.out.println(S + " " + T);
        
        sc.close();

    }
}
