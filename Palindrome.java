import java.util.*;

public class Palindrome {
    
    static Scanner sc = new Scanner(System.in);
    static String isPalindrome(String sting){ 
        String reverse = "";
        for(int i = sting.length()-1; i >= 0;i--){ 
            reverse = reverse + sting.charAt(i);
        }
        if(reverse.equals(sting)){ 
            return sting + " is a Plindrome";
        }else{
            return sting + " is not a Plindrome";
        }
    }
    public static void main(String args[]){
        System.out.println("Enter a number to check Palindrome or not");
        
        String str = sc.nextLine();

        System.out.println(isPalindrome(str));

    }
}
