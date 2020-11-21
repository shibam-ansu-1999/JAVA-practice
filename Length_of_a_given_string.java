import java.util.*;
class Length_of_a_given_string
{
    public static void main(String args[])
    {
        String str;
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to count it's length:");
        str = sc.nextLine();
        int i = 0;
        for(char c: str.toCharArray())
        {
            i++;
        }
        System.out.println("Length of the string is:"+" "+i);
    }
}