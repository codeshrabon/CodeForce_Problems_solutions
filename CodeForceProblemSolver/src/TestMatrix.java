public class TestMatrix {
    public static void main(String[] args) {
        int r =0;
        int c = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                i = r;
                j = c;
                System.out.println(r + " " + c);
            }
        }
        
    }
}
