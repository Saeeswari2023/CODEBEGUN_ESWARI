package Conditions;

public class Conditions {
	void compare() {
		Variables v = new Variables();
		v.a = 50;
		v.b = 20;
		v.c = 10;
		v.d = 40;
		v.e = 5;
		if(v.a>v.b && v.a > v.c && v.a > v.d && v.a > v.e) {
			System.out.println("Value 1: " + v.a);
		}else if(v.b>v.a && v.b > v.c && v.b > v.d && v.b > v.e) {
		    System.out.println("Value 2: " + v.b);
		}else if(v.c>v.b && v.c > v.a && v.c > v.d && v.c > v.e) {
			System.out.println("Value 3: " + v.c);
		}else if(v.d>v.a && v.d > v.b && v.d > v.c && v.d > v.e) {
			System.out.println("Value 4: " + v.d);
		}
		else {
			System.out.println("Value 5: " + v.e);
		}
	}
}
