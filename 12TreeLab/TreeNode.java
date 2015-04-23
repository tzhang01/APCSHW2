public class TreeNode<T>{
    private TreeNode<T> left;
    private TreeNode<T> right;
    private T data;
    
    public TreeNode(TreeNode<T> left, TreeNode<T> right, T data){
	setLeft(left);
	setRight(right);
	setData(data);
    }	

    public TreeNode(T data){
	setData(data);
    }

    public void setLeft(TreeNode<T> l){
	left = l;
    }

    public TreeNode<T> getLeft(){
	return left;
    }

    public void setRight(TreeNode<T> r){
	right = r;
    }

    public TreeNode<T> getRight(){
	return right;
    }

    public void setData(T d){
	data = d;
    }

    public T getData(){
	return data;
    }
}