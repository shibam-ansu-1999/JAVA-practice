import java.util.*;

public class Remove_duplicates_and_reverse{
   static String removeDuplicates(String s){
     String st = "";
     int n = s.length();
     
     if(n<2){
       return s;
       }
     int j =0;
     for(int i=0;i<n;i++){
       if(s.charAt(i)!=s.charAt(j)){
         j += 1;
         s.replace(s.charAt(j),s.charAt(i));
         }
         else{
           if(j==0){
             st = s;
             }
             else{
               st = s.substring(0,j)+s.substring(j+1);
               }
           }
       }
       j += 1;
       s= st.substring(0,j);
       return s;
     }

    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        String str2 = removeDuplicates(str);
        
        for(int k=str2.length()-1;k>=0;k--){
        System.out.print(str2.charAt(k));
        }
        
    }
}