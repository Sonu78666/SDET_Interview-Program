package arrays;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numsarr[]= {3,5,7,2,1,3};
		int k=4;
		rotate(numsarr,0,numsarr.length-1);
		rotate(numsarr,0, k-1);
		int result[]=rotate(numsarr, k, numsarr.length-1);
		System.out.println(Arrays.toString(result));
		
	}
	
	public static int[] rotate(int arr[],int sp,int ep)
	
	{
		while(sp<=ep)
		{
			int temp=arr[sp];
			arr[sp]=arr[ep];
			arr[ep]=temp;
			sp++;
			ep--;
		}
		return arr;
	}
}
