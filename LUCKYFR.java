import java.util.*;

public class LUCKYFR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;

       while (n>0) {
        if (n%10==4) {
            sum++;
        }
        n=n/10;
       }
       System.out.println(sum);
    }
}
