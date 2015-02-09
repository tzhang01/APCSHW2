public class Recursion{
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
	}
}
		
			
	

