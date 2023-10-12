package NestedConditions;

public class NestedConditionsMain {
	static int a=100,b=20;

	public static void main(String[] args) {
		nested();
	}
	
	static void nested() {
		if(a>b) 
			System.out.println("a is greater than b");
		else 
			System.out.println("b is greater than a");
		
		if(a >= b && b <= a) {
			if(a == b) {
				System.out.println("a is equal to b");
			}else {
				System.out.println("a is not equal to b");
			}
		}else {
			System.out.println("Both are not equal");
		}
		
		switch(b) {
		case 10:
			System.out.println("a");
			break;
		case 20:
			System.out.println(b);
			break;
		case 100:
			System.out.println(a);
			break;
		default:
			System.out.println("Case Default");
		}
		
	}
	
	
}
