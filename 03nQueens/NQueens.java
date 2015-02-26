import java.util.*;
import java.io.*;

public class NQueens{
    //constants for the class
    //terminal specific character to clear screen , or hide/show cursor
    final static String clear =  "\033[2J";
    final static String hide =  "\033[?25l";
    final static String show =  "\033[?25h";

    //instance variable
    private char[][]board;

    //terminal specific character to move the cursor
    private String go(int x,int y){
		return ("\033[" + x + ";" + y + "H");
    }
    
    public void wait(int millis){
		try {
	    	Thread.sleep(millis);
		}
		catch (InterruptedException e) {
		}
    }
    
    public String toString(){
		String ans = "\n";
		for(int i=0;i<board.length;i++){
	    	for(int j=0;j<board[i].length;j++){
				if(board[i][j] < 10){
					ans += "  " + board[i][j];
				}else{
					ans += " " + board[i][j];
				}
			}
	    	ans += "\n";
		}	
		return hide + clear + go(0,0) + ans + "\n" + show;
    }	

	public NQueens(int size){
		board = new char[size][size];
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				board[i][j] = '_';
			}
		}
	}
	
	public String name(){
		return "zhang.tina";
    }
	
	public boolean solve(){
		return solve(0,board.length);
	}
	
	public boolean solve(int x){
		if(x < 0 || x > board.length){
			return false;
		}
		board[x][0] = 'Q';
		return solve(1, board.length -1);
	}
	
	public boolean solve(int y, int numQueens){
		System.out.println(this);
		wait(200);
	
		if(numQueens == 0){
			return true;
		}
		for(int x=0;x<board.length;x++){
			if(canPlace(x,y)){
				board[x][y] = 'Q';
				if(solve(y+1, numQueens-1)){
					return true;
				}
				board[x][y] = '_';
			}
		}
		return false;
	}

	public boolean canPlace (int row, int col){
		for(int i=0;i<row;i++){
			if(board[i][col] == 'Q'){
				return false;
			}
		}
		
		int x = row;
		int y = col;
		while (x >= 0 && y >= 0){
			if(board[x][y] == 'Q'){
				return false;
			}
			x--;
			y--;
		}
		x = row;
		y = col;
		while(y < board.length && x >=0){
			if(board[x][y] == 'Q'){
				return false;
			}
			x--;
			y--;
		}
		return true;
	}

	public static void main(String[]args){
		NQueens f = new NQueens(8);
		f.solve();
		System.out.println(f);
	}
}
