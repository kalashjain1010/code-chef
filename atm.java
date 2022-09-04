import java.util.*;
import java.lang.*;
import java.io.*;

public class atm {
    public static void main(String[] args) throws java.lang.Exception {

        try {
            float d = 0.5f;

            Scanner sc = new Scanner(System.in);
            float a = sc.nextFloat();
            float b = sc.nextFloat();

            if (a >= 2000) {
                System.out.println();
            }
            else if (b>=2000) {
                System.out.println();
            }

            else if (a % 5 == 0) {
                if (a > b) {
                    System.out.println(b);
                } else if (b > a) {
                    float c = b - (a + d);
                    System.out.println(c);
                }
            } else {
                System.out.println(b);
            }
        } catch (Exception e) {
            System.out.println();
        }

    }
}
