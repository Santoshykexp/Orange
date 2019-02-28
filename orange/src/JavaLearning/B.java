package JavaLearning;

public class B {
	int i;

	B(int i){
		
		this.i=i;
}
	
	public void Add(int j) {
		System.out.println(i+j);
	}
	public void Add(int j,int k) {
		System.out.println(i+j+k);
	}
	
	public static void main(String[] args) {
		B ob=new B(40);
		ob.Add(20);
		B ob1=new B(30);
		ob1.Add(20, 30);
		
	}
}
