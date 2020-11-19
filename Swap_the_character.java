import java.util.*;
import java.lang.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class Swap_the_character {
	public static void main (String[] args) {
		int i,j;
	    String str1,str2,str3;
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 Strings:");
        str1=sc.nextLine();
        str2=sc.nextLine();
        str3=sc.nextLine();
		System.out.println("Special String is:");
		
		String regex1 = "([aeiouyAEIOUY]+)";
		System.out.print(str1.replaceAll(regex1,Matcher.quoteReplacement("$")));
		
        String regex2 = "([^aeiouAEIOU0-9\\W]+)";
        String result = str2.replaceAll(regex2,Matcher.quoteReplacement("#"));
        System.out.print(result);
		
        System.out.print(str3.toUpperCase());
	}
}