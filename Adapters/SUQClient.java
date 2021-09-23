package Adapters;

public class SUQClient {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
//		SUQPussEff stack = new SUQPussEff();
		
		SUQPopEff stack = new SUQPopEff();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		stack.display();
		
		System.out.println(stack.pop());
		
		stack.display();
		

	}

}
