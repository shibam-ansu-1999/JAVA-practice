import java.util.*;

class Marathon_race_maximum_runner{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double arr[] = new double[1];
		float res[] = new float[3];
		int i = 0,j = 0;
		System.out.println("Enter the distances covered by racers in Marathon (Kilometers) please");
		System.out.println("(press q to terminate):");
		 while(true){
			 try{
			 double input = sc.nextDouble();
			 if(input > 0 && input < 42.195){
				arr[i]=input;
				i++; 
			 }
			}
			catch(Exception e){
				break;
			}
			arr = Arrays.copyOf(arr,arr.length +1);
		 }
		 Arrays.sort(arr);
		for(i = arr.length-1;i>=0;i--){
			j++;
			if(j>3){
				break;
				}
			System.out.print(arr[i]+" ");
		}
	}
}