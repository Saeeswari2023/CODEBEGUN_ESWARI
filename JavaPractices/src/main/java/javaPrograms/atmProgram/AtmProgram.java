package javaPrograms.atmProgram;

public class AtmProgram {

	public static void main(String[] args) {
		AtmImplementation atm = new AtmImplementation();
		atm.AtmLogicMethodAuthentication();
		atm.amountMethod();
		atm.choiceChecker();
		atm.amountDispencer();
	}
}
