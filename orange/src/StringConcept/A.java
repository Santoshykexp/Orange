package StringConcept;

public class A {
	
	String str="Santosh";
	int i=0;
	
	public void emp() {
		System.out.println("Employee Name is "+str);
		System.out.println("Employee Complete Name is "+str.concat(" YK"));
		System.out.println("String lenght "+str.length());
		for(i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
		
	}
	
	public static void main(String[] args) {
		A ob= new A();
		ob.emp();
	}

}
