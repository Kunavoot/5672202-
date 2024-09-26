public class MultiTB {
    public static void main(String[] args) {
        for (int j = 2; j <= 12 ; j++) {
            System.out.println("Multiplication : " + j);
            for (int i = 1; i <= 12; i++)
                System.out.println(j + " x " + i + " = " + j * i);
        }
    }
}
