
public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {12,13,14,5,6,9,45};
		int a=2;
		int b=4;
		
		non_gen obj=new non_gen();
		obj.swap_ele(arr, a, b);
		obj.print(arr);
		}
	}

class non_gen{
	public <E>void swap_ele(int arr[],int i,int j){
		int temp=0;
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public void print(int arr1[]) {
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
	}
}

