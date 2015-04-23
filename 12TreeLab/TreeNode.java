public class TreeNode<T>{
    private TreeNode<T> left;
    private TreeNode<T> right;
    private T data;
    
    public TreeNode(TreeNode left, TreeNode right, T data){

    }

    public void setLeft(TreeNode<T> l){
	left = l;
    }

    public TreeNode getLeft(){
	return left;
    }

    public void setRight(TreeNode<T> r){
	right = r;
    }

    public TreeNode getRight(){
	return right;
    }

    public void setData(T d){
	data = d;
    }

    public T getData(){
	return data;
    }
}