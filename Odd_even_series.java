import java.util.*;
class Odd_even_series
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter the n to find the number at the nth position of the series");
    int n = sc.nextInt();
    int a = 0, b = 0;
    if(n % 2 == 0)
    {
      for(int i = 1 ; i <= (n-2) ; i = i+2)
      {
        a = a + 2;
        b = a / 2;
      }
	  System.out.println("Number at the "+n+"th position is");
      System.out.print(b);
     }
     else
     {
       for(int i = 1 ; i < (n-2)+1 ; i = i+2)
       {
         a = a + 2;
       }
	   System.out.println("Number at the "+n+"th position is");
       System.out.print(a);
     }
   }
}