import java.util.*;
import java.lang.*;


class Hypotenuse_of_a_triangle {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
        float hyp;
		System.out.println("Enter The Oposite Side:");
        float opp = sc.nextFloat();
		System.out.println("Enter The Adjucent Side:");
        float adj = sc.nextFloat();
        hyp=(float) Math.sqrt(Math.pow(opp,2) + (adj*adj));
        System.out.printf("The Hypotenus is:"+" "+"%.2f", hyp);
	}
}