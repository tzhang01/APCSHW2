public class LNode{
    private LNode next;
    private int data;

    public LNode(int data){
	setData(data);
	setNext(null);
    }
    
    public int getData(){
	return data;
    }
    public void setData(int d){
	data = d;
    }

    public LNode getNext(){
	return next;
    }
    public void setNext(LNode n){
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