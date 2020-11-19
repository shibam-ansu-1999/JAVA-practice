import java.util.*;
class Change_the_case_of_a_given_character
{
    public static void main(String args[])
    {
        char c;
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a charecter to convert it into alernet character:");
        c = sc.next().charAt(0);
	    if('A' <= c && c <= 'Z')
	        System.out.printf("%c",c+32);
	    if('a' <= c && c <= 'z')
	        System.out.printf("%c",c-32);
    }
}