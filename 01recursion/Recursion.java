public class Recursion implements hw1{
	public String name(){
		return "Zhang,Rouqian";
	}

	public int fact(int n){
		if(n < 0){
			throw new IllegalArgumentException();
		}else if(n == 1){
			return n;
		}else{
			return n * fact(n-1);
		}
	}

	public int fib(int n){
		if(n<0){
			throw new IllegalArgumentException();
		}else if(n == 0){
			return 0;
		}else if(n== 1){
			return 1;
		}else{
			return fib(n-1) + fib(n-2);
		}	
	}

	public double sqrt(double n){
		if(n <0){
			throw new IllegalArgumentException();
		}else{
			return sqrtHelper(n, 1);
		}				
	}
	public double sqrtHelper(double n, double guess){
		if(Math.abs(((n/guess + guess) /2) - guess) < 0.000001){
			return guess;
		}else{
			return sqrtHelper(n, (n/guess+guess)/2);
		}
	}

	/*	
	public static void main(String[]args){
		Recursion r = new Recursion();
		System.out.println(r.name());
		System.out.println(r.fact(4));
		System.out.println(r.fact(5));
		//System.out.println(r.fact(-3));
		System.out.println(r.fib(1));
		System.out.println(r.fib(0));
		System.out.println(r.fib(6));
		System.out.println(r.fib(4));
		System.out.println(r.sqrt(100));
		System.out.println(r.sqrt(25));
		System.out.println(r.sqrt(36));
		System.out.println(r.sqrt(2));
	}
	*/
}
		
			
	

