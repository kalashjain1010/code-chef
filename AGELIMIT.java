import java.util.*;

public class AGELIMIT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[3]; 

        for (int i = 0; i < n; i++) {
            for(int j =0; j<arr.length; j++){
            arr[j]=sc.nextInt();
        }
        if (arr[2]>=arr[0]&& arr[2]<arr[1]) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        }

    }
}
