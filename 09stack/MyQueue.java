public class MyQueue<T>{
    private MyLinkedList<T> q;

    public MyQueue(){
		q = new MyLinkedList<T>();
    }

    public boolean enqueue(T n){
		return q.add(n);
    }
	
    public T dequeue(){
		return q.remove(0);
    }
    
	public String toString(){
		return q.toString();
	}

    public static void main(String[]args){
		MyQueue<Integer> q = new MyQueue<Integer>();
		for(int i=0;i< 10;i++){
			q.enqueue(i);
		}
		System.out.println(q);
		System.out.println(q.dequeue());
		System.out.println(q);
		System.out.println(q.dequeue());
		System.out.println(q);
	
    }
    
}
