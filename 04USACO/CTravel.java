public class CTravel{
    private char[][] pasture = {{'.', '.', '.', '*', '.'},
				{'.', '.', '.', '*', '.'},
				{'.', '.', '.', '.', '.'},
				{'.', '.', '.', '.', '.'}};
    private int N, M, T, R1, R2, C1, C2, ways;

    public static void main(String[]args){
	CTravel c = new CTravel(4, 5, 6, 1, 3, 1, 5);
	System.out.println(c);
	System.out.println(c.travel());
    }
    public CTravel(int n, int m, int t, int r1, int c1, int r2, int c2 ){
	N = n;
	M = m;
	T = t;
	R1 = r1;
	C1 = c1;
	R2 = r2;
	C2 = c2;
	ways = 0;
    }
	
    public String toString(){
	String ans = "";
	for(int i=0;i<pasture.length;i++){
	    for(int j=0;j<pasture[i].length;j++){
		ans += pasture[i][j] + " ";
	    }
	    ans += "\n";
	}
	return ans;
    }
	
    public int travel(){
	return travel(R1, C1, T);
    }
    public int travel(int x, int y, int time){
	if(time == 0){
	    if( x == R2 && y == C2 && time == T){
		return 1;
	    }else{
		return 0;
	    }
	}

	if(pasture[x][y] == '*' || time ==0){
	    return 0;
	}
	return travel(x+1,y,time-1) +
	    travel(x-1,y,time-1) +
	    travel(x,y+1,time-1) +
	    travel(x,y-1,time-1);
    }
		
			
}


