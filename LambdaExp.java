@FunctionalInterface
interface MsgInterface{

	void sendMessage();
	default void msg(){
		System.out.println("Hii");
	}
}


@FunctionalInterface
interface SumInterface{

	void sum(int a, int b);
}


public class LambdaExp{

	public static void main(String []args){
		MsgInterface message = () -> System.out.println("Hello");
		message.sendMessage();

		SumInterface sumData = (a,b) -> System.out.println("Sun is: "+(a+b));
		sumData.sum(45,29);
	}
}