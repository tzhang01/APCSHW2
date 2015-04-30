public class BSTreeNode<T> implements Comparable<T>{
    private BSTreeNode<T> left;
    private BSTreeNode<T> right;
    private T data;
    
    public int compareTo(T o){
	return -1;
    }

    public BSTreeNode(BSTreeNode<T> left, BSTreeNode<T> right, T data){
	setLeft(left);
	setRight(right);
	setData(data);
    }	

    public BSTreeNode(T data){
	setLeft(null);
	setRight(null);
	setData(data);
    }

    public void setLeft(BSTreeNode<T> l){
	left = l;
    }

    public BSTreeNode<T> getLeft(){
	return left;
    }

    public void setRight(BSTreeNode<T> r){
	right = r;
    }

    public BSTreeNode<T> getRight(){
	return right;
    }

    public void setData(T d){
	data = d;
    }

    public T getData(){
	return data;
    }
}
