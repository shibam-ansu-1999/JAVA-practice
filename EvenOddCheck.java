import java.util.*;

public class EvenOddCheck {
    
    static String isEvenOdd(int number){
        if(number % 2 == 0){
            return number + " is a Even number";
        }
        else{
            return number + " is a Odd number";
        }
    }
    public static void main(String args[]){
        
        System.out.println("Enter a number to check even or Odd");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); 

        System.out.println(isEvenOdd(number));
    }
}
