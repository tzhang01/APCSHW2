public class LNode<T>{
    private LNode<T> next;
    private T data;

    public LNode(T data){
	setData(data);
	setNext(null);
    }
    public LNode(T data, LNode<T> link){
    	setData(data);
    	setNext(link);
    }
   
    public T getData(){
	return data;
    }
    public void setData(T d){
	data = d;
    }

    public LNode<T> getNext(){
	return next;
    }
    public void setNext(LNode<T> n){
	next = n;
    }

    public String toString(){
	String result = "";
	return result + data;
    }
    /*
      public static void main(String[]args){
      LNode n = new LNode(5);
      System.out.println(n);
      n.setData(2);
      System.out.println(n);
      }
    */
}
