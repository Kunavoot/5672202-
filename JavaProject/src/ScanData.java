import java.sql.SQLOutput;
import java.util.*;
public class ScanData {
    public static void main(String[] args) {
        String pname;
        int qty;
        double price;
        Scanner sn = new Scanner(System.in);
        System.out.println("Please enter quantity, price and " +
                            "product description then press Enter");
        qty = sn.nextInt();
        price = sn.nextDouble();
        pname = sn.nextLine();
        System.out.println("Product: " + pname);
        System.out.println("Quantity: " + qty);
        System.out.println("Price: " + price);
        System.out.println("Amount: " + qty * price);
    }
}
