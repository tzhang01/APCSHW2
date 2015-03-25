public class MyDeque<T>{
    private Object[] ary = new Object[10];

    public boolean isFull(Object[] a){
	for(int i=0;i<a.length;i++){
	    if(a[i] == null){
		return false;
	    }
	}
	return true;
    }

    //public void addFirst(T value){
	
}