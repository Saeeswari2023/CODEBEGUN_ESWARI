package javaPrograms.ThisSuperFinal;

public class MethodOne extends MethodTwo{
	int inputOne;
	int inputTwo;
	
	void method(int inputOne) {
		System.out.println("Main class variable value :: " + inputOne);
		System.out.println("this means current class variable :: " + this.inputOne);
		System.out.println("super means extended class variable :: " + super.inputOne);
	}
}
