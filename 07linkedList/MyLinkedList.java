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
		boolean done = false;
		if(sz == 0){
	   		start = new LNode(value);
			done = true;
		}else{
	    	LNode now = start;
			while(now.getNext() != null){
				now = now.getNext();
			}
			now.setNext(new LNode(value));
			done = true;
		}
		sz++;
		return done;
    }

	public void	add(int index, int value){
		if(index < 0 || index > sz){
			System.out.println("Index out of Bounds");
		}
		if(index == sz){
			add(value);
			return;
		}
		LNode now = start;
		while(index != 0){
			now = now.getNext();
			index--;
		}
		int temp = now.getData();
		now.setData(value);
		now.setNext(new LNode(temp, now.getNext()));
		sz++;
	}
		
	public int get(int index){
		if(index < 0 || index > sz){
			System.out.println("Index out of Bounds");
		}
		LNode now = start;
		while(index != 0){
			now = now.getNext();
			index--;
		}
		return now.getData();
	}

	public int set(int index, int value){
		if(index < 0 || index > sz){
			System.out.println("Index out of Bounds");
		}
		LNode now = start;
		while(index != 0){
			now = now.getNext();
			index --;
		}
		int temp = now.getData();
		now.setData(value);
		return temp;
	}

	public int remove(int index){
		if(index < 0 || index > sz){
			System.out.println("Index out of Bounds");
		}
		int temp;
		if(index == 0){
			temp = start.getData();
			start = start.getNext();
		}else{
			LNode now = start;
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
	
	public int indexOf(int value){
		LNode now = start;
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
		MyLinkedList s = new MyLinkedList();
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
