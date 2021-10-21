import java.util.*;

public class CheckPrime{

    static String isPrime(int number){
       
        if(number == 0 || number == 1){
           String statement = number + " is Not a prime Number";
           return statement; 
        }else{
            boolean flag = false;
            for(int i = 2; i <= number/2; i++){
                if(number % i == 0){
                    flag = true;
                    break;
                }
            }
            if(flag){
                return number +" is Not a prime Number";
            }
            else{
                return number +" is a prime Number";
            }

        }
    }
    
    public static void main(String args[]){

        System.out.println("Enter a number to check it is prime or not");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        String status = isPrime(number);
        System.out.println(status);
    }
}