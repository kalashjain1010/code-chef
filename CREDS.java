/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class CREDS {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[3];
        int sum =0;

        for (int j = 0; j < n; j++) {

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                arr[0]=4*arr[0];
                arr[1]=2*arr[1];
                arr[2]=0*arr[2];
                sum = sum+arr[i];
            }
            System.out.println(sum);
            sum=0;
        }

    }
}
