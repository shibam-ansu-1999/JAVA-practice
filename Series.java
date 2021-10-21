import java.util.*;

public class Series {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){

        int n = sc.nextInt();

        if(n%2 == 0){
            n = n / 2;
            long number = 275 * (n-1);
            System.out.println(number);
        }
        else{
            n = n / 2;
            long number = 550 * n;
            System.out.println(number);
        }
    }
}
