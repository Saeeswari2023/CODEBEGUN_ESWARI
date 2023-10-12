package Constructor;

public class Inputs {
	int inputOne;
	int inputTwo;
	int inputThree;
	int inputFour;
	
	Inputs(){
		
	}
	
	Inputs add(Inputs input) {
		input.inputThree = inputOne + inputTwo;
		return input;
	}
	
	Inputs(int inputOne,int inputTwo){
		this.inputOne = inputOne;
		this.inputTwo = inputTwo;
	}
}
