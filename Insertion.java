import java.util.Arrays;
public class Insertion{
	public static void main(String[] args) {
		int[] arr = {3,2,5,1,4};
		Insertionsort(arr);	
		System.out.println(Arrays.toString(arr));
		}
		public static int[] Insertionsort(int[] arr){
			for(int i = 0;i<=arr.length-2;i++){
				for(int j =i+1;j != 0;j--){
					if(arr[j] < arr[j-1]){
						swap(arr,j,j-1);
						}
						else{
							break;
							}
					}
				}
				return arr;
			}
			
			static void swap(int[] arr,int a,int b){
				int temp = arr[a];
				arr[a] = arr[b];
				arr[b] = temp;
				}
}
