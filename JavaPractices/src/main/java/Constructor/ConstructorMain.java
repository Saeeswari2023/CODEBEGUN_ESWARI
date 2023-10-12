package Constructor;

public class ConstructorMain {

	public static void main(String[] args) {
		Inputs input = new Inputs();
		input.inputOne = 10;
		input.inputTwo = 20;
		System.out.println(input.add(input).inputThree);
		System.out.println(input.inputOne + input.inputTwo);
		Inputs input1 = new Inputs(20,50);
		System.out.println(input1.inputOne + input1.inputTwo);
	}
}
