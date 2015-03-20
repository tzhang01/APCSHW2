import java.util.*;

public class MyLinkedList<T> implements Iterable<T>{

    private class MyLLIterator<T> implements Iterator<T>{
	private LNode<T> now;
	public  MyLLIterator(LNode<T> head){
	    now = head;
	}
	public boolean hasNext(){
	    boolean result = false;
	    if(now.getNext() != null){
		result = true;
	    }
	    return result;
	}
	public T next(){
	    if(hasNext()){
		T result = now.getData();
		now = now.getNext();
		return result;
	    }else{
		throw new NoSuchElementException();
	    }
	}
	public void remove(){
	    throw new UnsupportedOperationException();
	}
    }

    public Iterator<T> iterator(){
	return new MyLLIterator<T>(start);
    }

    private LNode<T> start;
    private int sz;

    public String name(){
	return "zhang.tina";
    }

    public MyLinkedList(){
	sz = 0;
    }
	
    public String toString(){
	if(sz == 0){
	    return "[ ]";
	}
	String result = "[";
	LNode<T> now = start;
	while(now.getNext() != null){
	    result += now + ", ";
	    now = now.getNext();	
	}
	result += now;
	return result + "]";
    }

    public boolean add(T value){
	boolean done = false;
	if(sz == 0){
	    start = new LNode<T>(value);
	    done = true;
	}else{
	    LNode<T> now = start;
	    while(now.getNext() != null){
		now = now.getNext();
	    }
	    now.setNext(new LNode<T>(value));
	    done = true;
	}
	sz++;
	return done;
    }

    public void	add(int index, T value){
	if(index < 0 || index > sz){
	    System.out.println("Index out of Bounds");
	}
	if(index == sz){
	    add(value);
	    return;
	}
	LNode<T> now = start;
	while(index != 0){
	    now = now.getNext();
	    index--;
	}
	T temp = now.getData();
	now.setData(value);
	now.setNext(new LNode<T>(temp, now.getNext()));
	sz++;
    }
		
    public T get(int index){
	if(index < 0 || index > sz){
	    System.out.println("Index out of Bounds");
	}
	LNode<T> now = start;
	while(index != 0){
	    now = now.getNext();
	    index--;
	}
	return now.getData();
    }

    public T set(int index, T value){
	if(index < 0 || index > sz){
	    System.out.println("Index out of Bounds");
	}
	LNode<T> now = start;
	while(index != 0){
	    now = now.getNext();
	    index --;
	}
	T temp = now.getData();
	now.setData(value);
	return temp;
    }

    public T remove(int index){
	if(index < 0 || index > sz){
	    System.out.println("Index out of Bounds");
	}
	T temp;
	if(index == 0){
	    temp = start.getData();
	    start = start.getNext();
	}else{
	    LNode<T> now = start;
	    while(index != 1){
		now = now.getNext();
		index--;
	    }
	    temp = now.getNext().getData();
	    now.setNext(now.getNext().getNext());
	}
	sz --;
	return temp;
    }

    public int size(){
	return sz;	
    }
	
    public int indexOf(T value){
	LNode<T> now = start;
	int index = 0;
	while(now != null){
	    if(now.getData() == value){
		return index;
	    }
	    now = now.getNext();
	    index++;
	}
	return -1;
    }

    public static void main(String args[]){
	MyLinkedList<Integer> s = new MyLinkedList<Integer>();
	s.add(3);
	s.add(2);
	s.add(9);
	System.out.println(s);
	s.add(1,10);
	System.out.println(s);
	System.out.println(s.get(2) + " should return 2");
	System.out.println(s.set(0, 23));
	System.out.println(s);
	System.out.println(s.remove(0));
	System.out.println(s);
	System.out.println(s.indexOf(9));
	System.out.println(s.size());
    }
}
