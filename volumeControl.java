import java.util.*;
import java.lang.*;
import java.io.*;

public class volumeControl {
    public static void main(String[] args) throws java.lang.Exception {
        try {
            Scanner sc = new Scanner(System.in);
            int z = sc.nextInt();

            for (int i = 0; i < z; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                if (x > y) {
                    int p = x - y;
                    System.out.println(p);
                } else if (y > x) {
                    int k = y - x;
                    System.out.println(k);
                } else {
                    System.out.println("error");
                }
            }
        } catch (Exception e) {
            System.out.println();
        }

    }

}
