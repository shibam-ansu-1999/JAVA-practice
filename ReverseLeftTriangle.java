import java.util.*;

public class ReverseLeftTriangle {
    
    static Scanner sc = new Scanner(System.in);

    static void starPattern(int row){
        
        for(int i = row;i >= 1; i--){
            for(int space = 1; space <= 2*(row-i); space++){
                System.out.print(" ");
            }
            for(int star = 1;star < i;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void NumberPattern(int row){
        
        for(int i = row;i >= 1; i--){
            for(int space = 1; space <= 2*(row-i); space++){
                System.out.print(" ");
            }
            int num = 1;
            for(int star = 1;star < i;star++){
                System.out.print(num +" ");
                num++;
            }
            System.out.println();
        }
    }

    static void AlphabatePattern(int row){
        
        for(int i = row;i >= 1; i--){
            for(int space = 1; space <= 2*(row-i); space++){
                System.out.print(" ");
            }
            int alphabate = 65;
            for(int star = 1;star < i;star++){
                System.out.print((char)alphabate +" ");
                alphabate++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        System.out.println("Enter Number of rows to print the pattern");

        int row = sc.nextInt();

        starPattern(row);
        NumberPattern(row);
        AlphabatePattern(row);
    }
}
