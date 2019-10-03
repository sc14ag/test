public class Child extends Parent {
	public Child(){
		//Implicit java invokes parent default constructor here
	
		super(10);
		System.out.println("Child constructor ...");
	}
	public void printDetails(){
		//Parent private methods are not inherited
		//System.out.println(privateVariable);
		
		System.out.println(protectedVariable);
		System.out.println(publicVariable);

		publicMethod();
		//privateMethod(); Parent's private method are not inherited
		protectedMethod(); 
	}
}
