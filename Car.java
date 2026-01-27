interface Vehicle{
	void cleanVehicle();			//Abstract method
	default void startVehicle(){
		System.out.println("Start Vehicle");
	}
	static void stopVehicle(){
		System.out.println("Stop Vehicle");
	}
}

public class Car implements Vehicle{
	@Override
	public void cleanVehicle(){
		System.out.println("Clean Vehicle");
	}

	public static void main(String []args){

		Car car = new Car();
		car.cleanVehicle();
		car.startVehicle();
//		car.stopVehicle();		//We cannot use that way for static method
		Vehicle.stopVehicle();
	}
}