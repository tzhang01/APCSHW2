import java.util.*;

public class RunningMedian{
    MyHeap small = new MyHeap(false); //max heap that holds the smaller half
    MyHeap large = new MyHeap(); //min heap that holds the larger half

    public double getMedian(){
	if(small[0] > large[0]){
	    return small.remove();
	}else if(small[0] < large[0]){
	    return large.remove();
	}else{
	    return (large.remove() + small.remove()) / 2;
	}
    }
}