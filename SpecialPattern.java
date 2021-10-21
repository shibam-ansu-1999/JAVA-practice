import java.util.*;

public class SpecialPattern {
    
    static Scanner sc = new Scanner(System.in);

    static void NumberPattern(int row){
        
        int num = 1;
        for(int i = 1;i <= row; i++){
            if(i != 1){
                num = num + 1;
            }
            for(int star = 1;star <= 4 ;star++){
                if(i %2 == 0 && star == 1){
                    num = num - 1;
                }
                else if(i % 2 == 1 && star == 4 ){
                    num = num + 1;
                }
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        System.out.println("Enter Number of rows to print the pattern");

        int row = sc.nextInt();

        NumberPattern(row);

    }
}
