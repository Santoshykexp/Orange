package StringConcept;

public class B {
	
	String str="Association";
	int i=0;
	int count=1;
	
	public void count() {
		if(str.charAt(i)==str.charAt(i+1)) {
			System.out.println(count);
			i++;
		}
		else {
			
		}
	}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B ob=new B();
		ob.count();

	}

}
