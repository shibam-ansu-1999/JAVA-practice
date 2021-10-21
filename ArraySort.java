import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class ArraySort {

    static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)throws IOException{
		int [] a = new int[8];
		int [] b = new int[7];
        for(int i = 0; i < a.length;i++){
            a[i] = sc.nextInt();
        }
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		for(int i: a){
		ar1.add(i);
		}
		for(int j: b){
		ar2.add(j);
		}
		ar1.addAll(ar2);
		//ArrayList sor = new ArrayList();
		Collections.sort(ar1);
//		for(int p : ar1)){
		System.out.println(ar1.toString());
//		} 
//		ar1.forEach((n) -> System.out.println(n));
	}
}