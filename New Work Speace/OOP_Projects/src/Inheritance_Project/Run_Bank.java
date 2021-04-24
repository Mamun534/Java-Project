package Inheritance_Project;


// oop means class is not doing anything but the object is doing everything hats why 
// its called object oriented programing...oop..
// class is basicaly a design or prototype...in oop..

public class Run_Bank {
	
	// This run Method for how to work inheritance...

	public static void main(String[] args) {
		
	bankAccount ba = new bankAccount();
	
	checkingAccount ca = new checkingAccount();
	// after checkingAccount class when i extends with bankaccount class 
	// now if i call ca. it will be connect with bankAccount class...which called inheritance..
	
	savingAccount sa = new savingAccount();
	// sa. that means this savingAccount class have accesss savingAccount and bankAccount
	// caz i extends checkingAccount class with savingAccount......
	
	ba.checkAccount();
	ba.depositMoney();
//.......this is abstruct idea..........................................//
	
	//Before absturct i can creat an object of the class...
	
	Abstract_class ac = new Abstract_class();
	
	
	// i cant not creat it caz the abastract......
	//Abstract1_class ac = new Abstract1_class();
	
	}

}
