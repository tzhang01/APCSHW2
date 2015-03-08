import java.util.*;

public class QuickSelect{
    public static int partition(int[]ary, int si, int ei){
		int[] d = new int[ary.length];
	
		for(int i=ei+1;i<ary.length;i++){
		    d[i] = ary[i];
		}
		for(int i=si-1;i>=0;i++){
		    d[i] = ary[i];
		}

		System.out.println(Arrays.toString(d));

		Random rand = new Random();
		int pivot = ary[rand.nextInt(ei-si) + si];
		
		System.out.println(pivot);

		int end = ei;
		for(int i=si;i<end;i++){ 
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
		return si;
    }
	public static int quickS(int[] ary, int num){
		if (num >= ary.length){
			throw new ArrayIndexOutOfBoundsException();
		}

		int[] temp = Arrays.copyOf(ary, ary.length);
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

    public static void main(String[]args){
	QuickSelect a = new QuickSelect();
	int[] test = new int[] {1, 45, 2234, 67, 34 ,7, 8, 24, 9};
	System.out.println(Arrays.toString(test));
	//partition(test, 0, 6);
	System.out.println(quickS(test, 3));
    }
}
