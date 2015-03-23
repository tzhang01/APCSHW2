public class MyQueue<T>{
    MyLinkedList<T> q;

    public MyQueue(){
	q = new MyLinkedList();
    }

    public boolean enqueue(T n){
	q.add(n);
    }
	
    public T dequeue(){
	q.remove(0);
    }
    
    public static void main(String[]args){
	MyQueue<Integer> q = new MyQueue<Integer>();
    }
    
}