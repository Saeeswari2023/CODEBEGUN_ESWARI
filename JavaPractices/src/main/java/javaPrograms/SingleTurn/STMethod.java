package javaPrograms.SingleTurn;

public class STMethod {
	int input1;
	int input2;
	int input3; 
	int input4;
	
	public static STMethod st=null;
	
	private STMethod() {
		
	}
	
	public static STMethod getInstance() {
		if(st == null) {
			return st =  new STMethod();
		}
		return st;
	}
}
