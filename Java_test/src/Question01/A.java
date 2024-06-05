package Question01;

import java.lang.reflect.Method;

class A {
	int m;
	void method() {
		System.out.println("A 클래스의 m 값: " + m);
	}
	
	public static void main(String[] args) {
		System.out.println();
		A a = new A();
		a.m = 5;
		System.out.println(a.m);
		a.method();
	}
	
}

