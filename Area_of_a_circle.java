import java.util.*;
import java.lang.*;


class Area_of_a_circle {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
        int dia;
        double area;
		int r;
		System.out.println("Enter the diameter of the circle to find the area:");
        dia = sc.nextInt();
        r= dia/2;
        area= 3.14*r*r;
        System.out.printf("Area of the circle is:"+" "+"%.2f",area);
	}
}