import java.util.*;

public class TestString {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Please input Text and press Enter : ");
        String txt = sn.nextLine();
        int qty = txt.length();
        System.out.println("Text is : " + txt);
        System.out.println("Text length is : " + qty);
        int index = txt.indexOf("e",0);
        index++;
            if(index > 0) {
                System.out.println("Index \"e\" is : " + index);
            }
            else {
                System.out.println("Not found \"e\" in Text");
            }
    }
}
