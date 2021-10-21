import java.util.*;

public class ReverseString {
    
    static String toReverse(String sting){
        String reverse = "";
        for(int i = sting.length()-1; i >= 0;i--){
            reverse = reverse + sting.charAt(i);
        }
        return reverse;
    }
    public static void main(String args[]){

        System.out.println("Enter a number to be reversed");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(toReverse(str));

    }
}
