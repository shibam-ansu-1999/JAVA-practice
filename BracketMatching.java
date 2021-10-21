import java.util.*;

class Stack {
   
    int MAX;
    int top;
    char a[];
 
    Stack(int n)
    {
        MAX = n;
        a = new  char[MAX];
        top = -1;
    }

    boolean isEmpty()
    {
        return (top < 0);
    }
 
    boolean push(char x)
    {
        a[++top] = x;
        return true;
    }
 
    boolean pop()
    {
        top--;
        return true;
    }
    char peek()
    {
        char x = a[top];
        return x;
    }
}





public class BracketMatching {

    static Scanner sc = new Scanner(System.in);

    static boolean checkMethod(String str){
        
        int len = str.length();
        Stack st = new Stack(len);
        char arr[] = str.toCharArray();
        Arrays.sort(arr);
        if(len % 2 == 0){
            for(char ch : arr){

                if(ch == '{' || ch == '('|| ch == '['){
                    st.push(ch);
                }
                else{
                    if(st.isEmpty()){
                        return false;
                    }
                    else if(st.peek() == '{' && ch == '}' || st.peek() == '[' && ch == ']' ||st.peek() == '(' && ch == ')'){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
            }

            return st.isEmpty() ? true : false;
        }
        else{
            return false;
        }

        
    }


    public static void main(String args[]){

        System.out.println("Enter an string of brackets");
        String brackets = sc.nextLine();
        String output = checkMethod(brackets) ? "It can be determine" : "It cann't be determine";
        System.out.println(output);

    }
    
}
