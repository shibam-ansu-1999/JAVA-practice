import java.util.*;

class Sum_of_previous_terms {
	public static void main (String[] args) {
	    int t1=1,t2=2,cur=0,i;
		System.out.print("Enter n to get the sum of last two terms: ");
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        if(n>30)
        {
    	    System.out.println("Invalid Input");
        }
        else
        {
            if(n==1 || n==2)
            {
      	        System.out.println(n);
            }
            else
            {
      	        for(i=3;i<=n;i++)
                {
          	        cur=t1+t2;
          	        t1=t2;
          	        t2=cur;
                }
                System.out.println(cur);
            }
        }
	}
}