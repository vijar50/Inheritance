package Inher;

public class Grandson extends Son{

	public static void main(String[] args) {
		//create a new obj instance of the Grandson class
		Grandson gs = new Grandson();
		//Grandson will have the properties of both Son and Grandfather
		//This is called multi-level inheritance
		gs.sonActivities();
		gs.country();
	}

}
