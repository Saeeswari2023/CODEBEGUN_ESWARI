package javaPrograms.Fractions;

public class Fractions {

	public static void main(String[] args) {
		System.out.print("1 ");
		int range=10,temp=1;
		float result = 1;
		
		for(int i=1;i<=range;i+=2) {
			if(temp%2 != 0) {
				System.out.print(" + ");
				result += 1.0/i;
			}else {
				System.out.print(" - ");
				result -= 1.0/i;
			}
			System.out.print(" 1/" + i);
			temp += 1;
		}
		System.out.print(" = " + result);
	}

}
