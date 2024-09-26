import java.lang.*;

public class String_Medthods {
    public static void main(String[] args) {
        String a = "   Java Programming   ";
        String s = a.trim();
        char c = a.charAt(0);
        int i = a.length() - s.length();
        String b = s.toUpperCase();
        String v = s.toLowerCase();
        String d = a.substring(3,7);
        int j = a.indexOf("Prog", 0);
        Boolean e1 = "Java".equals(d);
        Boolean e2 = d.equals("Java");
        Boolean e3 = "java".equals(d);
        int k1 = "Java".compareTo(d);
        int k2 = d.compareTo("java");
//        int k3 = "java".equals(d);
    }
}

