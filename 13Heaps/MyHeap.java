import java.util.*;

public class MyHeap{
    private int[] heap;
    private int mode;
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
    }

    public String toString(){
	return "";
    }
    public int remove(){
	int size = heap[0];
	if(size == 0){
		throw new NoSuchElementException();
	}else{
		int result = heap[1];
		heap[1] = heap[size]; 
		heap[0] = --size;
		int i =1;
		while(getLeft(i) <= size){
			int l = getLeft(i);
			int r = getRight(i);
			if(r <= size){
				if(heap[i] < heap[l] || heap[i] < heap[r]){
					int dif = heap[1] - heap[r];
					if(dif > 0){
						swap(i,1);
						i = 1;
					}else if(dif < 0){
						swap(i, r);
						i = r;
					}
				}else{
					return result;
				}
			}else if(heap[i] < heap[l]){
				swap(i, l);
				i = l;
			}else{
				return result;
			}
		}
		return result;
	}
    }
    public void add(int value){
	//if adding value to empty heap
	if(heap[0] == 0){
	    heap[1] = value;
	}	
	//checks if heap need to be resized
	if(heap[0] == heap.length-1){
	    resize();
	}
	int size = heap[0] + 1;	
	//adds value to the next spot
	heap[size] = value;
	heap[0] = size;
	int i = size;
	//compare value to parent
	while(getParent(i) > 0){
		int parentIn = getParent(i);
	//if min: smaller push up, max: bigger push up
		if(heap[i] > heap[parentIn]){
			swap(i, parentIn);
		}
	    	i = parentIn;
	}
    }

    private void resize(){
	heap = Arrays.copyOf(heap, heap.length*2+1);
    }

    public int peek(){
	if(heap[0] == 0){
		throw new NoSuchElementException();
	}else{
		return heap[1];
	}
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
