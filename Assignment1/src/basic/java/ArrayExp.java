package basic.java;

import java.util.Scanner;

public class ArrayExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Scanner s=new Scanner(System.in);
		int[] arr= {5,10,15,20,25,30,35,40,45,50};
		int query=s.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==query) {
				System.out.println("Your number in array:"+i);
				break;
			}
			else {
				System.out.println("number not in array");
		}
	}
	}
}
