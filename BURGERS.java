import java.util.*;
public class BURGERS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[j]=sc.nextInt();
            }
            if (arr[0]>=arr[1]) {
                System.out.println(arr[1]);
            }
            else{
                System.out.println(arr[0]);
            }
        }
    }
}
