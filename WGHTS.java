import java.util.*;
public class WGHTS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[4];
        int sum =0;

        for (int j = 0; j < n; j++) {

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                
            }
            System.out.println(sum);
            sum=0;
        }

    }
}
