public class Parent{
	private int privateVariable;
	protected int protectedVariable;
	public int publicVariable;
/*
	public Parent(){
		System.out.println("Parent default constructor ...");


	}
*/
	public Parent(int x){
		System.out.println("Parent overloaded constructor ...");
	
	}
	public void publicMethod(){

		System.out.println("Parent public method ...");
	}
	protected void protectedMethod(){
		System.out.println("Parent protected method ...");

	}
	private void privateMethod(){
		System.out.println("Parent private method ...");
	}

}
