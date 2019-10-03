public class Mobile {


	private int x,y;

	public  Mobile(){
		System.out.println("Default constructor");
		x=10;
		y=20;
	}

	public Mobile(int x,int y){
		this.x = x;
		this.y=y;
	
	}

	public void printDetails(){
		System.out.println("X= "+x +"Y= "+y);
	}	
	

}

