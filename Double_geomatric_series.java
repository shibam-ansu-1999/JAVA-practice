import java.util.*;
public class Double_geomatric_series
{
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("Enter the n to find the number at the nth position of the series");
		int n = sin.nextInt();
		System.out.println("Number at the "+n+"th position is");
		System.out.println(n%2==0?(int)Math.pow(3,(n-1)/2):(int)Math.pow(2,(n-1)/2));
	}
}