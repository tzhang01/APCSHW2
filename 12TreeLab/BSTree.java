import java.io.*;
import java.util.*;

public class BSTree <T extends Comparable> {

    private BSTreeNode<T> root;
    private Random rand = new Random();

    public BSTree() {
	root = null;
    }

    public boolean isEmpty() {
	return root == null;
    }

    /*======== public void add() ==========
      Inputs:   T c  
      Returns: 

      Wrapper for the recursive add method
      ====================*/
    public void add( T c ) {
	root = add( root, new BSTreeNode<T>(c) );
    }

    /*======== public BSTreeNode<T> add() ==========
      Inputs:  BSTreeNode<T> curr
               BSTreeNode<T> t 
      Returns: 

      Add t to the correct place in the tree rooted at curr.
      ====================*/
    private BSTreeNode<T> add(BSTreeNode<T> curr, BSTreeNode<T> t) {
	if(curr == null){
		return t;
	}else if(curr.compareTo(t) < 0){
		curr.setRight(add(curr.getRight(), t));
		return curr;
	}else{
		curr.setLeft(add (curr.getLeft(), t));
		return curr;
	}
	
    }

    /*======== public void remove() ==========
      Inputs:   T c  
      Returns: 
      
      Wrapper for the recursive remove method
      ====================*/
    public void remove( T c ) {
	BSTreeNode<T> compare = new BSTreeNode<T>(c);
	root = remove( root, c );
    }

    /*======== public BSTreeNode<T> remove() ==========
      Inputs:   BSTreeNode<T> curr
		T c
      Returns: 

      Should remove the value c from the tree rooted at
      curr, if it exists.
      ====================*/
    private BSTreeNode<T> remove( BSTreeNode<T> curr, T c ) {
	if(curr == null){
		return curr;
	}
	if(c.compareTo(curr) < 0){
		curr.setLeft(remove(curr.getLeft(), c));
	}else if(c.compareTo(curr) > 0){
		curr.setRight(remove(curr.getRight(), c));
	}else{
		if(curr.isLeaf()){
			curr = null;
		}else if(curr.numChildren() == 1){
			if(curr.getLeft() == null){
				curr.setData(getLater(curr));
			}else{
				curr.setData(getPrev(curr));
			}
		}else{
			int x = rand.nextInt(2);
			if(x == 0){
				curr.setData(getLater(curr));
			}else{
				curr.setData(getPrev(curr));
			}
		}
	}
	return curr;
    }

    public T getPrev(BSTreeNode<T> curr){
	if(curr.getLeft().isLeaf()){
		T data = curr.getLeft().getData();
		curr.setLeft(null);
		return data;
	}else{
		BSTreeNode<T> r = curr.getLeft();
		while(r.getRight().getRight() != null){
			r = r.getRight();
		}
		BSTreeNode<T> h = r.getRight();
		r.setRight(null);
		return h.getData();
	}
     }

     public T getLater(BSTreeNode<T> curr){
	if(curr.getRight().isLeaf()){
		T data = curr.getRight().getData();
		curr.setRight(null);
		return data;
	}else{
		BSTreeNode<T> l = curr.getRight();
		while(l.getLeft().getLeft() != null){
			l = l.getLeft();
		}
		BSTreeNode<T> h = l.getLeft();
		l.setLeft(null);
		return h.getData();
	}
      }

    /*======== public void inOrder()) ==========
      Inputs:   
      Returns: 

      Wrapper for the recursive inOrder method
      ====================*/
    public void inOrder() {
	inOrderHelper( root );
	System.out.println();
    }

    /*======== public void inOrderHelper() ==========
      Inputs:   BSTreeNode<T> t  
      Returns: 
      
      Performs an in-order traversal for the tree with 
      root t.
      ====================*/
    public void inOrderHelper( BSTreeNode<T> t ) {
	if (t == null) 
	    return;
	inOrderHelper( t.getLeft() );
	System.out.print( t.getData() + " ");
	inOrderHelper( t.getRight() );
    }

   
    public static void main( String[] args ) {

    }

}
