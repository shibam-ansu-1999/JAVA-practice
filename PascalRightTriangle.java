import java.util.*;

public class PascalRightTriangle {
    
    static Scanner sc = new Scanner(System.in);

    static void starPattern(int row){
        
        for(int i = 1;i <= row; i++){
            for(int star = 1;star < i;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = row-1;i >= 1; i--){
            for(int star = 1;star < i;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void NumberPattern(int row){
        
        for(int i = 1;i <= row; i++){
            int num = 1;
            for(int star = 1;star < i;star++){
                System.out.print(num +" ");
                num++;
            }
            System.out.println();
        }
        for(int i = row-1;i >= 1; i--){
            int num = 1;
            for(int star = 1;star < i;star++){
                System.out.print(num +" ");
                num++;
            }
            System.out.println();
        }
    }

    static void AlphabatePattern(int row){
        
        for(int i = 1;i <= row; i++){
            int alphabate = 65;
            for(int star = 1;star < i;star++){
                System.out.print((char)alphabate +" ");
                alphabate++;
            }
            System.out.println();
        }
        for(int i = row-1;i >= 1; i--){
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
