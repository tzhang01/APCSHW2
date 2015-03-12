public class MyLinkedList{
    private LNode start;
	private int sz;

    public MyLinkedList(){
		sz = 0;
    }
	
	public String toString(){
		if(sz == 0){
			return "[ ]";
		}
		String result = "[";
		LNode now = start;
		while(now.getNext() != null){
			result += now + ", ";
			now = now.getNext();	
		}
		result += now;
		return result + "]";
	}

    public boolean add(int value){
		if(sz == 0){
	   		start = new LNode(value);
		}else{
	    	LNode now = start;
			while(now.getNext() != null){
				now = now.getNext();
			}
			now.setNext(new LNode(value));
		}
		sz++;
		return true;
    }
	

	public static void main(String args[]){
		MyLinkedList s = new MyLinkedList();
		s.add(3);
		s.add(2);
		s.add(9);
		System.out.println(s);
	}
}
