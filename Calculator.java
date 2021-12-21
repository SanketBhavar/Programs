public class Calculator {
	//data members 
	int a,b,ans; 
	//member functions
	public void add(){
		ans = a+b;
		System.out.println("addition is : "+ans);
	}
	public void sub(){
		ans = a-b;
		System.out.println("substraction is : "+ans);
	}
	public void mul(){
		ans = a*b;
		System.out.println("multiplication is : "+ans);
	}
	public void div(){
		ans = a/b;
		System.out.println("division is : "+ans);
	}
	public void initialise(){
		a = 10;
		b = 2;
	}

	public static void main(String[] args){
		Calculator c1 = new Calculator();
		c1.initialise();
		c1.add();
		c1.sub();
		c1.mul();
		c1.div();
	}
}
