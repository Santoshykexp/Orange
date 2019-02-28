package JavaLearning;

public class A {
	
	int i=10;
	static int j=30;
	
	public void Add() {
		int j=20;
		int m=A.j+j;
		System.out.println(m);
		
	}
	
	public static void main(String[] args) {
		A oj=new A();
		int k= oj.i+j;
		
		System.out.println(k);
		oj.Add();
		
	}
}
