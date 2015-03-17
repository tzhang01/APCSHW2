import java.util.*;

public class Sorts{
    private int[]deck;

    public String name(){
	return "zhang.tina";
    }

    public static void main (String[]args){
/*
		try{
	    	int size = (Integer)args[1];
	    	int which = (Integer)args[0];
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Type 0 for mergeSort or 1 for Array.out and the size of the array that you want sorted");
		}
*/
		int[] start = new int[1000];
		int[]array = {3,4,77,32,1,3};
		Random r = new Random();
		for(int i=0;i<size;i++){
	    	start[i] = r.nextInt(20000);
    	}
		Sorts a = new Sorts();

		System.out.println(start);
		//if(args[0] == 0){
			a.mergeSort(start);
			System.out.println(start);
		//}else{
			a.sort(start);
			System.out.println(start);
		}
    }
    public static void mergeSort(int[] deck){
		int[] pile1 = new int [deck.length /2];
		int[] pile2 = new int [deck.length - pile1.length];
		for(int i=0;i<pile1.length;i++){
	    	pile1[i] = deck[i];
		}
		for(int i=0;i<pile2.length;i++){
	    	pile2[i] = deck[deck.length /2 + i];
		}
		mergeSort(pile1, pile2);
   	 }

    public static void mergeSort(int[] pile1, int[] pile2){
		if(pile1.length >1){
	   		mergeSort(pile1);
		}
		if(pile2.length >1){
	    	mergeSort(pile2);
		}
		int[]sorted = new int[pile1.length + pile2.length];
		int place1=0;
		int place2=0;
		for(int i=0;i<sorted.length;i++){
	    	if(place1 == pile1.length){
				sorted[i] = pile2[place2++];
	    	}else if(place2 == pile2.length){
				sorted[i] = pile1[place1++];
	    	}else{
				if(pile1[place1] < pile2[place2]){
				    sorted[i] = pile1[place1++];
				}else{
				    sorted[i] = pile2[place2++];
				}
	    	}
	    	deck = sorted;
		}				
    }
}
