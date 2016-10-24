/*
*DamienApp.java
*@author D.Grouse
*12 Oct 2016
*
*/

public class DamienApp{
	public static void main(String args []){
		//declare variables
		int num1 = 7;
		int num2 = 3;
		int ans;
// ooooohhhh ouch!!!
// more useless notes
		//trying to break git
		//declare objects/instantiable class(creating an instance
		Damien damo; //(creating an instance)
		damo = new Damien();

		//call set method
		damo.setFirstNum(num1);
		damo.setSecondNum(num2);
		//call process/compute method
		damo.doTheSum();
		//call the get method and store the answer
		ans = damo.gimmeTheAnswer();

		//output
		System.out.println(ans);
	}
}
