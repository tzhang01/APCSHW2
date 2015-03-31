import java.util.*;
import java.io.*;

public class Maze{
    private static final String clear = "\033[2J";
    private static final String hide = "\033[?251";
    private static final String show = "\033[?25h";
    private static final int DFS = 1;
    private static final int BFS = 0;
    
    private char[][]maze;
    private int maxx, maxy;
    private int startx, starty;
    
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
    private class Coordinate{
	private int row, col;
	
	public Coordinate(int x, int y){
	    row = x;
	    col = y;
	}

	public int getRow(){
	    return row;
	}
	public int getCol(){
	    return col;
	}
    }


} 