package constructor;


class A {
	
	public A() {
		
		System.out.println("Construcotr A");
	}

}

class B extends A {
	
	public B() {
		System.out.println("Constructor B");
		
	}
}

class C extends B{
	
	
	public C() {
		System.out.println("Constructor C");
	}

}



