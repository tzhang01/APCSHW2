
public class Sorts{
    private int[]deck;
    public Sorts(int[]arr){
	deck = arr;
    }	
    public static void main (String[]args){
	try{
	    size = args[1];
	    which = args[0];
	}catch(ArrayIndexOutOfBoundsException){
	}
	int[] start = new int[size];
	for(int i=0;i<size;i++){
	    start[i] = 
    }
    
    public void mergeSort(int[] deck){
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
    public void mergeSort(int[] pile1, int[] pile2){
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
