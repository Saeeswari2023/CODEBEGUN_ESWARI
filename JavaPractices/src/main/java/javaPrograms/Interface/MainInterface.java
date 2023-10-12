package javaPrograms.Interface;

public class MainInterface {

	public static void main(String[] args) {
		InterfaceImplemented implement = new InterfaceImplemented();
		implement.methodOverLoading();
		implement.methodOverLoading(50, 20);
		System.out.println("OverRiding method :: " + implement.methodInterface("Code","Begun"));
	}

}
