public class mazeSolver{
	public char[][] solvem(char[][] maze){
		char[][] copy = new char[maze.length][maze.length];
		copy = maze;
		int x, y;
		for(int i=0;i<maze.length;i++){
			for(int j=0; j<maze[i].length;j++){
				if(maze[i][j] == 'S'){
					x =i;
					y =j;
				}
			}
		}
		return solver(copy, x, y);
	}
	public char[][] solver(char[][]maze, int xcor, int ycor){
		
	}
}
