public class MyStack<T>{
	private MyLinkedList<T> stk;
	
	public MyStack(){
		stk = new MyLinkedList<T>();
	}
	
	public void push(T n){
		stk.add(0, n);
	}
	public T peek(){
		return stk.get(0);
	}
	public T pop(){
		return stk.remove(0);
	}

	public String toString(){
		return stk.toString();
	}
	
	public static void main(String[]args){
		MyStack<Integer> q = new MyStack<Integer>();
		for(int i=0;i<10;i++){
			q.push(i);
		}

		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.pop());
		System.out.println(q);
	}
}


