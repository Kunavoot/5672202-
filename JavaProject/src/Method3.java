public class Method3 {
    public static int g(int n) {
        for (int i = n; i >= 0;) {
            if (n > 0) {
                if(n == 1) {
                    System.out.print("2");
                }
                else {
                    System.out.print("2 x ");
                }
                return 2 * g(n-1);
            }
            else {
                System.out.print(" = ");
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int n = 9;
            System.out.println(g(n));
    }
}
