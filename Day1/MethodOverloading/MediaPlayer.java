public class MediaPlayer{

	public MediaPlayer(){
		System.out.println("Default constructor");
	}
	public MediaPlayer(int x){
		System.out.println("Overloaded constructor with singlw argument");
	}

	public MediaPlayer(int x,int y){
		System.out.println("Overloaded contstructor with two arguments");
	}
	public MediaPlayer(String s){
		System.out.println("Overloaded contstructor with single string argument");
	}
	public void print(){
		System.out.println("print with no arguments");
	}
	public void print (long x){
		System.out.println("print within a single long argument");
	}
	public void print(int x){
		System.out.println("print with single int argument");
	}
	public void print (String s){
		System.out.println("print with single String argument");
	};
	
	public static void main(String[] args){
		MediaPlayer player = new MediaPlayer();
		player.print(); //Invokes print with no argument
		player.print(10L);//Invokes print with single int argument
		player.print("Hello"); //Invokes print with singl String argument
	
	}
}
