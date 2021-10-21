import java.util.*;

public class Pattern_10101 {

    static Scanner sc = new Scanner(System.in);

    static void Pattern(int row){
        
        for(int i = 1;i <= row; i++){
            for(int space = 1; space <= 2*(row-i); space++){
                System.out.print(" ");
            }
            for(int star = 0;star < 2*i-1;star++){
                if(star % 2 == 0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        System.out.println("Enter Number of rows to print the pattern");

        int row = sc.nextInt();

        Pattern(row);//5
    }
    
}
