import java.util.*;

public class TCKTFINE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[3];
        int sum =0;

        for (int j = 0; j < n; j++) {

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                int k = arr[1]-arr[2];
                sum=arr[0]*k;
            }
            System.out.println(sum);
            sum=0;
        }
    }
}
