public class BSTreeNode<T> implements Comparable<T>{
    private BSTreeNode<T> left;
    private BSTreeNode<T> right;
    private T data;
    
    public TreeNode(TreeNode<T> left, TreeNode<T> right, T data){
	setLeft(left);
	setRight(right);
	setData(data);
    }	

    public TreeNode(T data){
	setLeft(null);
	setRight(null);
	setData(data);
    }

    public void setLeft(TreeNode<T> l){
	left = l;
    }

    public TreeNode<T> getLeft(){
	return left;
    }

    public boolean hasLeft(){
	return left != null;
    }

    public void setRight(TreeNode<T> r){
	right = r;
    }

    public TreeNode<T> getRight(){
	return right;
    }
	
    public boolean hasRight(){
	return right != null;
    }

    public void setData(T d){
	data = d;
    }

    public T getData(){
	return data;
    }
}
