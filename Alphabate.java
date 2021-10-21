import java.util.*;

public class Alphabate {

    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){

        String s1 = sc.nextLine();

        s1 = s1.toLowerCase();

        for(int i = 0; i < s1.length(); i ++){

            int ascii = s1.charAt(i);

            System.out.print(26- (122 - ascii));

        }
        
    }
}

