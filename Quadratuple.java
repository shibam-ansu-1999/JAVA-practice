import java.util.*;

class Quadratuple{
	
	static int quadra(int a[],int n){
		
		if(n<4){
			return 0;
		}
		else{
			int max=0,temp;
			for(int p = 0; p < n-3;p++){
				for(int q = p+1; q < n-2;q++){
					for(int r = q+1; r < n-1;r++){
						for(int s = r+1; r < n;r++){
							temp = a[p]*a[q]*a[r]*a[s];
							if(max<temp){
								max = temp;
							}
						}
					}
				}
			}
			return max;
		}
	}
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of integers to be input:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter "+n+" integers:");
		for(int i = 0; i < n;i++){
			arr[i] = sc.nextInt();
		}
		
		int res = quadra(arr,n);
		
		if(res==0){
			System.out.println("Invalid Input");
		}
		else{
			System.out.println(res);
		}
		
	}
	
}