package JavaLearning;

public class CountObject {
	
	static int i=0;
	
	CountObject(){
		i++;
		
	}
	

	public static void main(String[] args) {
		CountObject o1=new CountObject();
		CountObject o2=new CountObject();
		CountObject o3=new CountObject();
		CountObject o4=new CountObject();
		System.out.println(i);
	}
}
