import java.util.*;
//import java.lang.*;


class Sober_walk {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of steps:");
	    int n=sc.nextInt();
	    char c = 'R';
        int x = 0, y = 0;
        while(n>0){
        switch(c){
            case 'R':
                x = Math.abs(x) + 10;
                y = Math.abs(y);
                c ='U';
                break;
            case 'U':
                y = y + 20;
                c = 'L';
                break;
            case 'L':
                x = -(x + 10);
                c = 'D';
                break;
            case 'D':
                y = -(y);
                c = 'R';
                break;
            }
        n--;
    }
		System.out.println("After"+ n +"th steps He/She will reach at:");
		System.out.println(x+" "+y);
	}
}