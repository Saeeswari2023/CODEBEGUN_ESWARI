package javaPrograms.ThisSuperFinal;

public class ThisSuperFinal {

	public static void main(String[] args) {
		final int inputOne = 20;
//		inputOne = 80;
		MethodOne m1 = new MethodOne();
		m1.inputOne = 30;
		m1.inputTwo = 40;
		m1.method(inputOne);
	}

}
