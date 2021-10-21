import java.util.*;

public class Anagram {

    static Scanner sc = new Scanner(System.in);

    static int length(String str){

        int i=0;
        try{
            for(i=0;;i++)
            {
                str.charAt(i);
            }
        }
        catch(Exception e){}
        
        return i;
    }

    static char[] toCharrArray(String str){

        int len = length(str);

        char arr[] = new char[len];

        for(int i = 0;i < len;i++){
            arr[i] = str.charAt(i);
        }
        
        return arr;
    }
    
    static char[] sort(char arr[]){
        
        for (int i = 0; i < arr.length; i++) {
 
            for (int j = 0; j < arr.length; j++) {
       
             if(arr[j] > arr[i]){

                  char temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;

                }
            }
       
        }  
        return arr;
    }

    static boolean equals(char arr1[],char arr2[]){

        if(arr1.length != arr2.length){
            return false;
        }else{

            for(int i = 0;i < arr1.length;i++){
                if(arr1[i] != arr2[i]){
                    return false;
                }
            }
            
            return true;
        }
    }



    static void anagramCheck(String s1, String s2){
        // int l1 = s1.length();
        // int l2 = s2.length();

        int l1 = length(s1);
        int l2 = length(s2);

        if(l1 != l2){
            System.out.println("Not an Anagram");
        }
        else{

            // char arr1[] = s1.toCharArray();
            // char arr2[] = s2.toCharArray();

            char arr1[] = toCharrArray(s1);
            char arr2[] = toCharrArray(s2);

            // Arrays.sort(arr1);
            // Arrays.sort(arr2);

            arr1 = sort(arr1);
            arr2 = sort(arr2);

            // if(Arrays.equals(arr1, arr2)){
            //     System.out.println("Wow these are Anagram");
            // }else{
            //     System.out.println("Not an Anagram");
            // }

            if(equals(arr1, arr2)){
                System.out.println("Wow these are Anagram");
            }else{
                System.out.println("Not an Anagram");
            }

        }

    }

    static public void main(String args[]){

        System.out.println("Enter the 1st string");
        String s1 = sc.nextLine();

        System.out.println("Enter the 2nd string");
        String s2 = sc.nextLine();

        anagramCheck(s1,s2);
    }

}
