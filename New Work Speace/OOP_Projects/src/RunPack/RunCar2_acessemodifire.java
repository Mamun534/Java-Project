package RunPack;

import CarPack.Car_Pack_two;

public class RunCar2_acessemodifire {

	public static void main(String[] args) {
		
		// This for accesess modifire....
		// This Method is conneted CarPack 2 
		// how to use modifire....
		// accesess modifire ..public,protected,privet etc

		Car_Pack_two ct = new Car_Pack_two();
		
		//ct.  when call from car pack two class i can't see the startengine 
		// functions can i make it protected.....
		
		// ct.  when call from car pack two class i can't see the StopEngine
		// functions can i make it private.....
		ct.StopEngine(); // i see the StopEngine but not StopTransmission caz is private
	}

}
