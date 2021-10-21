import java.util.*;

public class PyramidPattern{

    static Scanner sc = new Scanner(System.in);

    static void starPattern(int row){
        
        for(int i = 1;i <= row; i++){
            for(int space = 1; space <= row-i; space++){
                System.out.print(" ");
            }
            for(int star = 0;star < i;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void NumberPattern(int row){
        
        for(int i = 1;i <= row; i++){
            for(int space = 1; space <= row-i; space++){
                System.out.print(" ");
            }
            int num = 1;
            for(int star = 0;star < i;star++){
                System.out.print(num +" ");
                num++;
            }
            System.out.println();
        }
    }

    static void AlphabatePattern(int row){
        
        for(int i = 1;i <= row; i++){
            for(int space = 1; space <= row-i; space++){
                System.out.print(" ");
            }
            int alphabate = 65;
            for(int star = 0;star < i;star++){
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

