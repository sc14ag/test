public class Main  {
	public static void main(String[] args){
		Child child  = new Child();
		child.printDetails();	
		//This proves protected parent methods can be
		//accessed outside child object
		child.protectedMethod();

	}

}
