import java.util.*;

public class ArmstrongNumberCheck {
    
    static String isArmstrong(String number){
        int n = number.length();
        int tempNumber = Integer.parseInt(number);
        int temp = Integer.parseInt(number);
        int sum = 0;
        while(temp > 0){
            int r = temp % 10;
            sum += Math.pow(r, n);
            temp = temp/10;
        }
        if(tempNumber == sum){
            return number + " is a Armstrong Number";
        }else{
            return number + " is not a Armstrong Number";
        }
    }
    public static void main(String args[]){

        System.out.println("Enter a number to check Armstrong or not");
        Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt();
        // String strNumber = Integer.toString(number);
        String strNumber = sc.nextLine(); 
        System.out.println(isArmstrong(strNumber));
    }
}
