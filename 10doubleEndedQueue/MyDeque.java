import java.util.*;

public class MyDeque<T>{

    public String name(){
	return "tina.zhang";
    }

    private Object[] ary;
    private int[] priorities;
    private int head;
    private int tail;
    private int size;

    public MyDeque(){
	ary = new Object[10];
	priorities = new int[10];
	head = 0;
	tail = 9;
	size = 0;
    }

    public String toString(){
	String result = "[ ";
	if(size>0){
	    if(head <= tail){
		for(int i=head;i<=tail;i++){
		    result += ary[i] + " ";
		}
	    }else{
		for(int i=head;i < ary.length;i++){
		    result += ary[i] + " ";
		}
		for(int i=0;i<=tail;i++){
		    result += ary[i] + " ";
		}
	    }
	}
	return result + "]";
    }
	
    public void resize(){
	Object[] newArray = new Object[ary.length*2];
       	int[] newPQ = new int[priorities.length*2];
	if(head < tail){
	    for(int i=head; i<=tail;i++){
		newArray[i] = ary[i];
	       	newPQ[i] = priorities[i];
	    }
	}else{
	    for(int i=head;i<ary.length;i++){
		newArray[i] = ary[i];
	       	newPQ[i] = priorities[i];
	    }
	    for(int i=0;i<=tail;i++){
		newArray[i+ary.length] = ary[i];
	       	newPQ[i+priorities.length] = priorities[i];
	    }
	    tail += ary.length;
	}
	ary = newArray;
	priorities = newPQ;
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
	if(ary[head] == null){
	    throw new NoSuchElementException();
	}
	return (T)ary[head];
    }
    public T getLast(){
	if(ary[tail] == null){
	    throw new NoSuchElementException();
	}
	return (T)ary[tail];
    }

    public void addFirst(T value){
	if(isFull(ary)){
	    resize();
       	}
	head--;
	if(head == -1){
	    head = ary.length-1;
	}
	ary[head] = value;
	size++;
    }

    public void addLast(T value){
	if(isFull(ary)){
	    resize();
	}
	tail++;
	if(tail == ary.length){
	    tail =0;
	}
	ary[tail] = value;
	size++;
    }

    public T removeFirst(){
	if(ary[head] == null){
	    throw new NoSuchElementException();
	}
	size--;
	T result = (T)ary[head];
	head++;	
	if(head == ary.length){
	    head = 0;
	}
	return result;
    }
    public T removeLast(){
	if(ary[tail] == null){
	    throw new NoSuchElementException();
	}
	size--;
	T result = (T)ary[tail];
	tail--;
	if(tail == -1){
	    tail = ary.length -1;
	}
	return result;
    }

    //priority queue functions
    public void add(T thing, int priority){
	addLast(thing);
	priorities[tail] = priority;
    }

    public T removeSmallest(){
	int min = 0;
	for(int i=0;i<priorities.length;i++){
	    if(priorities[i] < priorities[min]){
		min = i;
	    }
	}
	T result = (T)ary[min];
	ary[min] = ary[head];
	ary[head] = result;
	head++;
	size--;
	if(head == ary.length){
	    head = 0;
	}
	return result;
    }

    

    public static void main(String[] args){
	MyDeque<Integer> q = new MyDeque<Integer>();
	MyDeque<Integer> d = new MyDeque<Integer>();
	System.out.println(q);
	q.addFirst(1);
	System.out.println(q);
	q.addFirst(2);
	System.out.println(q);
	q.addLast(120);
	System.out.println(q);
	q.addLast(12);
	System.out.println(q);
	for(int i=0;i<20;i++){
	    d.addFirst(i);
	    System.out.println(d);
	}
	System.out.println(d.removeLast());
	System.out.println(d.removeFirst());
	System.out.println(d);
    }

}
