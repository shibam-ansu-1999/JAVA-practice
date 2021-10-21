import java.util.*;

public class Frequency {
    
    static Scanner sc = new Scanner(System.in);

    static String capitalizeWord(String str){  

        String special = "`~@#$%^&*(){}[]|?|";
        final int N = special.length();
        Random rd = new Random();

        String words[]=str.split(" ");  
        String capitalizeWord="";  
        for(String w:words){  
            String first=w.substring(0,1);  
            String afterfirst=w.substring(1);  
            capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
        }  
        return capitalizeWord.trim() + special.charAt(rd.nextInt(N));  
    }  

    public static void main(String args[]){

        String s1 = sc.nextLine();
        char ch = sc.next().charAt(0);
        s1 = s1.toLowerCase();
       char chs = Character.toLowerCase(ch);
        int count = 0;

        for(int i = 0; i < s1.length(); i ++){

            if(chs == s1.charAt(i)){
                count += 1;
            }

        }
        System.out.println("Frequency of " + ch + " = " +count);
        System.out.println("Final string = " + capitalizeWord(s1));
    }
}
