import java.util.*;

public class AVGPROBLEM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float arr[] = new float[3];
        float avg=0;
      
        for (int j = 0; j < n; j++) {

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextFloat();
                 avg = (arr[0]+arr[1])/2;
                
                
            }
            if (avg>arr[2]) {
                System.out.println("YES");
            }
            else if(avg<=arr[2]){
                System.out.println("NO");
            }
            avg=0;
        }
    }
}
