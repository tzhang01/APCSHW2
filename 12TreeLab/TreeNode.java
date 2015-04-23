public class TreeNode<T>{
    private TreeNode<T> left;
    private TreeNode<T> right;
    private T data;
    
    public TreeNode(TreeNode left, TreeNode right, T data){

    }

    public void setLeft(TreeNode l){
	left = l;
    }

    public TreeNode getLeft(){
	return left;
    }

    public void setRight(TreeNode r){
	right = r;
    }

    public TreeNode getRight(){
	return;
    }

    public void setData(T d){
    }

    public T getData(){
	return;
    }
}