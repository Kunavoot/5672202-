interface MyNumber {
    public String findNumber(int[] num);
}

class MaxNum implements MyNumber {
    public String findNumber(int[] num) {
        String str = "";
        int maxnum = num[0];
        for (int i : num) {
            if (maxnum < i) {
                maxnum = i;
            }
        }
        str = "Maximum Number is " + maxnum;
        return str;
    }
}
public class Main2 {
    public static void main(String[] args) {
        MaxNum mn = new MaxNum();
        int[] myNum = {10, 20, 300, 40, 50};
        System.out.print("Set of Number is " );
        for (int i = 0; i < myNum.length; i++) {
            System.out.print(myNum[i]);
            if (i != (myNum.length - 1)){
                System.out.print(",");
            }
        }
        System.out.println("\n" + mn.findNumber(myNum));
    }
}
