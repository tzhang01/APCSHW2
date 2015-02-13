public class Driver{
    public static void main(String[]args){
	KnightsTour b = new KnightsTour(Integer.parseInt(args[0]));
	b.solve(0,0);
    }
}