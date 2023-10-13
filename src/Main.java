import com.google.common.primitives.Booleans;

public class Main {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        int output = Booleans.compare(a, b);
        System.out.println("Сравнивая " + a
                + " и " + b + " : "
                + output);


        boolean a2 = true;
        boolean b2 = false;
        int output2 = Booleans.compare(a2, b2);
        System.out.println("Comparing " + a2
                + " and " + b2 + " : "
                + output2);


        boolean a3 = false;
        boolean b3 = true;
        int output3 = Booleans.compare(a3, b3);
        System.out.println("Comparing " + a3
                + " and " + b3 + " : "
                + output3);
    }
}