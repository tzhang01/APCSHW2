import java.util.*;

public class MyHeap{
    private int[] heap = new int[2];
    private int mode;
    private int size = 0;
    private static final int MAX = 0;
    private static final int MIN = 1;

    public MyHeap(){
	this(true);
    }
    public MyHeap(boolean isMax){
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
    public void add(int value){
	if(size == 0){
	    heap[1] = value;
	}
	size++;
	    
    }

    private void resize(){
	heap = Arrays.copyOf(heap, heap.length*2+1);
    }

    public int peek(){
	return heap[1];
    }

    public static void main(String[]args){
	MyHeap h = new MyHeap();
    }
	
}