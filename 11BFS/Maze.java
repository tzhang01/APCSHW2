import java.util.*;
import java.io.*;

public class Maze{
    private char[][]frontier;
    private int maxx, maxy;
    private int startx, starty;

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