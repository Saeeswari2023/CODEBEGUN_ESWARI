package javaPrograms.Abstract;

public class AbstractMain {

	public static void main(String[] args) {
		ChildAbstract child = new ChildAbstract();
		System.out.println("Addition of Two Numbers :: " + child.abstractMethod(20,30));
	}

}
