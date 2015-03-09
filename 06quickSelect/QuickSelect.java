import java.util.*;

public class QuickSelect{
    public static int partition(int[]ary, int si, int ei){
	Random rand = new Random();
	int num = rand.nextInt(ei-si) + s;
	int pivot = ary[num];

	System.out.println(pivot);
	int start = si;
	int end = ei;
	swap(ary, pivot, num);
	
	/*
	int end = ei;
	for(int i=si;i<=end;i++){ 
	    if(ary[i] < pivot){
		d[si] = ary[i];
		si++;
	    }else if(ary[i] > pivot){
		d[ei] = ary[i];
		ei--;
	    }
		
	    System.out.println(Arrays.toString(d));
	
	}
	d[si] = pivot;     
	System.out.println(Arrays.toString(d));
	return si;
	*/
    }
    public static int quickSelect(int[] ary, int num){
	int[] temp = Arrays.copyOf(ary, ary.length);
	System.out.println(Arrays.toString(temp));
	int test = partition(temp, 0, temp.length-1);
	while(test != num){
	    if(test > num){
		test = partition(temp, 0, test-1);
	    }else{
		test = partition(temp, test, temp.length-1);
	    }
	}
	return temp[test];
    }

    public static void swap(int[] ary, int i, int j){
	int temp = ary[i];
	ary[i] = ary[j];
	ary[j] = temp;
    }
    public static void main(String[]args){
	QuickSelect a = new QuickSelect();
	int[] test = new int[] {1, 45, 2234, 67, 34 ,7, 8, 24, 9};
	System.out.println(Arrays.toString(test));
	//partition(test, 0, 6);
	System.out.println(quickSelect(test, 3));
    }
}
