package Inher;
//extends Grandfather - will inherit the properties of the Grandfather class
public class Son extends Grandfather {

	public static void main(String[] args) {
		//create an instance of the Son class
		Son s = new Son();
		//We can now use the methods defined in Grandfather on Son object s as it has inherited Grandfather
		s.city();
		s.country();
		//print the int i in Grandfather
		System.out.println(s.i);
		
		
	}
	public void sonActivities() {
		System.out.println("Cricket, Football");
	}
}
