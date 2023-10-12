package javaPrograms.SingleTurn;

public class SingleTurnMain {

	public static void main(String[] args) {
		
		STMethod st = STMethod.getInstance();
		st.input1 = 20;
		st.input2 = 30;
		System.out.println(st.input1 + st.input2);
		STMethod st1 = STMethod.getInstance();
		st1.input1 = 30;
		System.out.println(st1.input1);
	}

}
