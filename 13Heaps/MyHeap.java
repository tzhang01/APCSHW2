public class MyHeap{
    private int[] heap = new int[2];
    private int mode;
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
    }

    public String toString(){
	return "";
    }
    public int remove(){
	return 0;
    }
    public void add(int value){
    }
    public int peek(){
	return heap[1];
    }

    public static void main(String[]args){
	MyHeap h = new MyHeap();
    }
	
}