import java.util.*;
public class DETSCORE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[2]; 
        int p =0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[j]=sc.nextInt();
                int k = arr[0]/10;
                 p = k*arr[1];
            }
            System.out.println(p);
        }

    }
}
