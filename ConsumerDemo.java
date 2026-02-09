import java.util.function.Consumer;
public class ConsumerDemo{
	public static void main(String []args){
		Consumer<String> con1 = arg -> System.out.println(arg + " Priyabrata Sur");
		Consumer<String> con2 = arg -> System.out.println(arg + " Debjit");

		(con1).andThen(con2).accept("Bye.");
	}
}