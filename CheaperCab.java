/* package codechef; // don't place package name! */

import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
public class CheaperCab
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println("enter no. of element:");
		Scanner sc = new Scanner(System.in);
		int z = sc.nextInt();
       

        for (int i = 0; i < z; i++) {
            System.out.println("enter two elemnets:");
            Scanner pc = new Scanner(System.in);
            int x = pc.nextInt();
            int y = pc.nextInt();
            if (x>y) {
                System.out.println("x is greater");
            }
            else if (x==y) {
                System.out.println("any");
            }
           else {
                System.out.println("y is greater");
            }
        }

	}
}
