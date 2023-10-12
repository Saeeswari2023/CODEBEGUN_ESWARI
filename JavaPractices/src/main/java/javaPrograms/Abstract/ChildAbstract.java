package javaPrograms.Abstract;

public class ChildAbstract extends ParentAbstract {
	@Override
	int abstractMethod(int inputOne, int inputTwo) {
		return inputOne + inputTwo;
	}
}
