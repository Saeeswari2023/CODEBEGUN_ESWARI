package PatternProgram;

public class PatternAscending {
	void patternOne(int n,String s) {
		for(int i=0; i<n; i++) {
			s = "* " + s;
			System.out.println(s);
		}
	}
	
	void patternTwo(int n,String s) {
		for(int i=0; i<n; i++) {
			s = "* ".repeat(n-i);
			System.out.println(s);
		}
	}
	
	void patternThree(int n,String s) {
		for(int i=0; i<n; i++) {
			s = " ".repeat((n-i-1) * 2) + "* ".repeat(i+1);
			System.out.println(s);
		}
	}
	
	void patternFour(int n, String s) {
		for(int i=0; i<n; i++) {
			s = " ".repeat(i*2) + "* ".repeat(n-i);
			System.out.println(s);
		}
	}
}
