import java.util.*;
import java.lang.*;


class Factorial{
	
	static long factorial(int n){
		
		if(n== 0 || n== 1){
			return 1;
		}
		else{
			return n*factorial(n-1);
		}
	}
	public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			int num;
			System.out.println("Enter a number to find it's factorial:");
			num = sc.nextInt();
			long res = factorial(num);
			System.out.println("The factorial of the number is:"+"  "+res);
		} 
} 