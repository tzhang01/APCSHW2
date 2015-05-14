import java.util.*;

public class MyHeap{
    private int[] heap;
    private int mode;
    private int size = 0;
    private static final int MAX = 0;
    private static final int MIN = 1;

    public String name(){
	return "zhang.tina";
    }

    public MyHeap(){
	this(true);
    }
    public MyHeap(boolean isMax){
	heap = new int[5];
	if (isMax){
	    mode = MAX;
	}else{
	    mode = MIN;
	}	
	heap[0] = size;
    }

    public String toString(){
	return "";
    }
    public int remove(){
	return 0;
    }
    public void add(int value, int mode){
	//if adding value to empty heap
	if(size == 0){
	    heap[1] = value;
	}	
	//checks if heap need to be resized
	if(size == heap.length-1){
	    resize();
	}	
	//adds value to the next spot
	heap[size+1] = value;
	//compare value to parent
	//if min: smaller push up, max: bigger push up
	size++;
	    
    }

    private void resize(){
	heap = Arrays.copyOf(heap, heap.length*2+1);
    }

    public int peek(){
	return heap[1];
    }

    public void swap(int a, int b){
	int temp = heap[a];
	heap[a] = heap[b];
	heap[b] = temp;
    }

    private int getLeft(int i){
	return i *2;
    }
    private int getRight(int i){
	return i*2 +1;
    }
    private int getParent(int i){
	return i /2;
    }	

    public static void main(String[]args){
	MyHeap h = new MyHeap();
    }
	
}
