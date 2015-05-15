import java.util.*;

public class RunningMedian{
    MyHeap small = new MyHeap(false); //max heap that holds the smaller half
    MyHeap large = new MyHeap(); //min heap that holds the larger half

    public double getMedian(){
	if(small.size() > large.size()){
	    return small.remove();
	}else if(small.size() < large.size()){
	    return large.remove();
	}else{
	    return (large.remove() + small.remove()) / 2;
	}
    }

    public void add(int value){
	//compare value with median and adds it to appropriate side
	if(value > getMedian()){
	    large.add(value);
	}else{
	    small.add(value);
	}
    }
}