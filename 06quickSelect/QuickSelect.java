import java.util.*;

public class QuickSelect{
	public static String arrayPrint(int[] ary){
		String ans = "[ ";
		for(int i=0;i<ary.length;i++){
			ans += ary[i] + " ";
		}
		return ans + "]";
	}
	
	public static void partition(int[]ary, int si, int ei){
		//make a new empty array called D of the same size as ARY
		int[] d = new int[ary.length];
		//copy all the elements not in the range SI to EI over to the new array
		for(int i=ei+1;i<ary.length;i++){
			d[i] = ary[i];
		}
		for(int i=si-1;i>=0;i++){
			d[i] = ary[i];
		}

		//System.out.println(arrayPrint(d));
		//select a pivot element and pull it out of the arrray. Just choose L[SI] for now and increment SI
		Random rand = new Random();
		int pivot = ary[rand.nextInt(ei-si)];
		//System.out.println(pivot);
		int r = si;
		int l = ei;
		for(int i=si;i<=ei;i++){
			if(ary[i] < pivot){
				d[r] = ary[i];
				r++;
			}else if(ary[i] > pivot){
				d[l] = ary[i];
				l--;
			}
			//System.out.println(arrayPrint(d));
		}
		d[r] = pivot;
		//System.out.println(arrayPrint(d));
	}

	public static void main(String[]args){
		QuickSelect a = new QuickSelect();
		int[] test = new int[] {1, 45, 2234, 67, 34 ,7, 8, 24, 9};
		System.out.println(arrayPrint(test));
		partition(test, 0, 6);
	}
}
