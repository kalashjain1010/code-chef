import java.util.*;

public class CARTRIP {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();

    for (int i = 0; i < n; i++) {
        int k = sc.nextInt();
        if (k<300) {
            System.out.println("3000");
        }
        else{
            System.out.println(k*10);
        }
        
    }
    
    }
}
