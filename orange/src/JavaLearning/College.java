package JavaLearning;

public class College {
	
	static int count=0;
	College(){
		count++;
		//System.out.println(count);
	}

	public static void main(String[] args) {
		College CSE=new College();
		System.out.println(count);
		College IT=new College();
		System.out.println(count);

}
}
