public class MyLinkedList{
    private LNode start;
    public MyLinkedList(){
    }
    public boolean add(int value){
	if(start.getNext() == null){
	    start = new LNode(value);
	}else{
	    ...
	}
    }
}