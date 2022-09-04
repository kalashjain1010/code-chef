import java.util.*;

public class sample {
    public static void main(String[] args) {
        System.out.println("enter a no.: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 3==0 && n%5==0   ) {

            System.out.println("fizzbuzz");
            
        }
        else if(n %3 ==0 && n%5 != 0) {
            System.out.println("fizz");
        }
        else if(n %3 !=0 && n%5 == 0) {
            System.out.println("buzz");
        }
        else if (n==3) {
            System.out.println("Fizz");
        }
         else if (n==5) {
            System.out.println("Buzz");
        }

        else{
            System.out.println(n);
        }

       
    }
}
