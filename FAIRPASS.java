import java.util.*;
import java.lang.*;
import java.io.*;

public class FAIRPASS {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc1=new Scanner(System.in);
		int t=sc1.nextInt();
		for(int i=0;i<t;i++){
		    int N=sc1.nextInt();
		    int K=sc1.nextInt();
		    if(N<K){
		        System.out.println("YES");
		    }
		    else
		    System.out.println("NO");
		}
	}
}
