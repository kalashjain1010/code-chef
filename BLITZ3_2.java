import java.util.*;
public class BLITZ3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[3]; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[j]= sc.nextInt();

            }
            int k = 2*(arr[0]+180);
            int p = arr[1]+arr[2];
            int c = k-p;
            System.out.println(c);
        }
    }
}