import java.util.*;
class Enchiper
{
    public static void main(String args[])
    {
        char ch;
        int encipher;
        int key;
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to Encrypt:");
		String str = sc.nextLine();
		System.out.println("Enter the Key value:");
		key=sc.nextInt();
        
		for(int i =0;i< str.length();i++){
			ch = str.charAt(i);
			
			if(Character.isLowerCase(ch))
			{
				encipher=(((int)ch-97)+key)%26;
				System.out.print((char)(encipher+97));
			}
			else
			{
				encipher=(((int)ch-65)+key)%26;
				System.out.print((char)(encipher+65));
			}
		}
    }
}

