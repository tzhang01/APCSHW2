public class MyDeque<T>{
    private Object[] ary;
    private int head;
    private int tail;

    public MyDeque(){
	ary = new Object[10];
    }

    public boolean isFull(Object[] a){
	for(int i=0;i<a.length;i++){
	    if(a[i] == null){
		return false;
	    }
	}
	return true;
    }

    public T getFirst(){
	return (T)ary[head];
    }
    
    /**
    public void addFirst(T value){
	if(isFull){
	    Object[] newAry = new Object[ary.length * 2];
	    for(int i=0;i<ary.length;i++){
		newAry[i] = ary[i];
	    }
	    ary = newAry;
	}
	
    **/
}