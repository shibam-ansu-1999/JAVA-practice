import java.util.*;


class To_zero_not_to_zero {
	public static void main (String[] args) {
	    Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Starting Number:");
	    int low =sc.nextInt();
		System.out.println("Enter the Ending Number:");
	    int up =sc.nextInt();
	    for(int i=low; i<=up; i++)
        {
        if(up>=100)
            System.out.printf("%03d ",i);
        else if(up>=10)
            System.out.printf("%02d ",i);
        else
            System.out.printf("%d ",i);
       }
	}
}