import java.util.*;
public class Oddly_even
{
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("Emter the Number to get the oddly even difference:");
		String s = sin.nextLine();		
        long oddsun = 0, evensum = 0;
		oddsun += s.charAt(0)-'0';
		for(int i=1;i<s.length();i++)
		{
		    if(i%2==0)
		        oddsun += s.charAt(i)-'0';
		   else
		     evensum += s.charAt(i)-'0';
		}
		System.out.println(Math.abs(oddsun - evensum));
	}
}