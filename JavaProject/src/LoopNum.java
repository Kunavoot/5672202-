public class LoopNum {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 10 == 0 && i != 0) {
                System.out.println(i);
            }else if (i == 0) {
                System.out.println("0");
            }
        }
    }
}
