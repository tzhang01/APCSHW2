import java.util.*;
import java.io.*;

public class Maze{
    private static final String clear = "\033[2J";
    private static final String hide = "\033[?251";
    private static final String show = "\033[?25h";
	private String go(int x, int y){
		return ("\033[" + x + ";" + y + "H");
	}	

    private static final int DFS = 1;
    private static final int BFS = 0;
    
    private char[][]maze;
	private int[] solution;
    private int maxx, maxy;
    private int startx, starty;
	private Coordinate end;

	private class Coordinate{
		private int row, col;
		private Coordinate previous;

		public Coordinate(int row, int col){
		    this.row = row;
		    this.col = col;
		}
		
		public void setPrevious(Coordinate cor){
			previous = cor;
		}
		public Coordinate getPrevious(){
			return previous;
		}
		public int getRow(){
			return row;
		}
		public int getCol(){
			return col;
		}
    }
   
    private class Frontier{
		private int mode;
		private int DFS = 1;
		private int BFS = 0;
		//private int Best = 2;
		//private int AStar = 3;
		private MyDeque<Coordinate> todo =  new MyDeque<Coordinate>();

		public Frontier(int mode){
		    this.mode = mode;
		}

		public void add(Coordinate value){
			if(mode == DFS){ 
				todo.addFirst(value);
	    	}
	    	else if(mode == BFS){
				todo.addLast(value);
	    	}
		}
	
		public Coordinate remove(){
		    if(mode == DFS){
				return todo.removeLast();
		    }
		    return todo.removeFirst();
		}

		public boolean isEmpty(){
			return todo.isEmpty();
		}
    }

	public Maze(String filename){
		startx = -1;
		starty = -1;
		String ans = "";
		try{
	    	Scanner in = new Scanner(new File(filename));
		    while(in.hasNext()){
				String line = in.nextLine();
				if(maxy == 0){
			   		maxx = line.length();
				}
				maxy++;
				ans+= line;
		    }
		}catch(Exception e){
	    	System.out.println("File: " +filename+" could not be opened");
	    	e.printStackTrace();
	    	System.exit(0);
		}
	
		maze = new char[maxx][maxy];
		for(int i=0;i<ans.length();i++){
		    char c = ans.charAt(i);
		    maze[i%maxx][i/maxx] = c;
		    if(c=='S'){
				startx = i%maxx;
				starty = i/maxx;
	    	}
		}
	}
    
    public String toString(){
		String ans = "" + maxx + ", " + maxy + "\n";
		for(int i=0; i<maxx*maxy;i++){
	   		if(i%maxx == 0 && i != 0){
				ans += "\n";
	    	}
	    	ans += maze[i%maxx][i/maxx];
		}
		return ans;
    }
    public String toString(boolean animate){
		if(animate){
	 	   return hide + clear + go(0,0) + toString() + "\n" + show;
		}
		return toString();
    }

/*
    public boolean solve(int mode, boolean animate){
		Frontier list = new Frontier(mode);
		Coordinate start = new Coordinate(startx, starty);
		list.add(start);
	
		if(startx < 0){
	    	System.out.println("No starting point 'S' found in the maze");
	    	return false;
		}
		
		while(list.hasNext()){
			if(animate){
				try {
	    			Thread.sleep(20);
				}
				catch (InterruptedException e) {
				}
				System.out.println(toString(animate));
			}

			Coordinate now = list.remove();
			int row = now.getRow();
			int col = now.getCol();

			if((!(row < 0 || col < 0 || x >= maxx || y >= maxy)) && 
			   (!(maze[row][col] == '#' || maze[row][col] == '.'))){
				if(maze[row][col] == 'E'){
					end = now;
					Coordinate place = end;
					while(place != null){
						place = place.getPrevious();
					}
					System.out.println(toString());
					return true;
				}else{
					maze[row][col] = '.';
					Coordinate a = new Coordinate(row-1, col);
					a.setPrevious(now);
					Coordinate b = new Coordinate(row+1, col);
					a.setPrevious(now);
					Coordinate c = new Coordinate(row, col-1);
					a.setPrevious(now);
					Coordinate d = new Coordinate(row, col+1);
					a.setPrevious(now);
					list.add(a);
					list.add(b);
					list.add(c);
					list.add(d);
				}
			}
		}
		System.out.println("No Solution");
		return false;
	}*/
} 
