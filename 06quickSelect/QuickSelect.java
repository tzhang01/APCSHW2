import java.util.*;

public class QuickSelect{
	public static int partition(int[]ary, int si, int ei){
		
		Random rand = new Random();
		int num = rand.nextInt(ei-si+1) + si;
		int pivot = ary[num];
		
		//System.out.println(pivot);

		int start = si;
		int end = ei;
		
		swap(ary, num, end);
		end--;
	
		//System.out.println(Arrays.toString(ary));

		while(start != end){
			if(ary[start] > pivot){
				swap(ary, start, end);
				end--;
			}else{
				start++;
			}
			//System.out.println(Arrays.toString(ary));
		}
		swap(ary, ei, start);

		//System.out.println(Arrays.toString(ary));
		return start;
	}

	public static int quickSelect(int[] ary, int numLowest){
		int start = 0;
		int end = ary.length-1;
		int test = partition(ary, start, end);
		while(test != numLowest){
			if(test > numLowest){
				start = test;
			}else{
				end = test;
			}
			test = partition(ary, start, end);
		}
		return ary[test];
	}

	public static void swap(int[] ary, int i, int j){
		int temp = ary[i];
		ary[i] = ary[j];
		ary[j] = temp;
	}

	public static void quickSort(int[] ary){
		sortHelper(ary, 0, ary.length-1);
	}

	public static void sortHelper(int[] ary, int start, int end){
		if(start<end){
			int pivot = partition(ary,start,end);
			sortHelper(ary,start,pivot-1);
			sortHelper(ary,pivot+1,end);
		}
	}
	
	public static void main(String[]args){
		int[] test = new int[] {1, 45, 2234, 67, 34 ,7, 8, 24, 9};
		System.out.println(Arrays.toString(test));
		//partition(test, 0, test.length-1);
		//System.out.println(quickSelect(test, 3) + " should return 9");
		quickSort(test);
		System.out.println(Arrays.toString(test));
	}
}
