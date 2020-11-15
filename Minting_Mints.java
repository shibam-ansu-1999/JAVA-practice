import java.util.*;


class Minting_Mints {
	public static void main (String[] args) {
		int n,len,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the minute the 1st Boy have:");
		n=sc.nextInt();
		System.out.println("Enter the length of the queue:");
		len=sc.nextInt();
	    int a[]=new int[len];
	    a[0]=sum=n;
	    for(int i=1;i<len;i++)
	    {
		a[i]=sum-1;
		sum=sum+a[i];
	    }
	    System.out.print(sum);
	}
}