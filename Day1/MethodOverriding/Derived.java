public class Derived extends Base{
	
	private int z;

	public Derived(int x, int y, int z){

		super(x,y);
		System.out.println("Derived constructor");
		this.z = z;
	}
	//Method overriding - modifying parent's inherited method
	public void printDetails(){
		super.printDetails(); //Code reuse
		System.out.println("Derived class printDetails method");		
		System.out.println("Z= "+z);		
	}


}
