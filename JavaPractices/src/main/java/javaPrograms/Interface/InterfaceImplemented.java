package javaPrograms.Interface;

public class InterfaceImplemented implements InterfaceMethod{
	@Override
	public String methodInterface(String firstName, String lastName) {
		return firstName + lastName;
	}@Override
	public void methodOverLoading(int inputOne, int inputTwo) {
		System.out.println("Method Overloading With Parameters :: " + (inputOne - inputTwo));
	}
	@Override
	public void methodOverLoading() {
		System.out.println("Method Overloading without Parameters :: " + "Overloading");
	}
}
