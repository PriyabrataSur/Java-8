import java.util.function.Supplier;
public class SupplierDemo{
	public static void main(String []args){
		Supplier<String> sup = () -> {
			StringBuilder otp = new StringBuilder("");
			for(int i = 1; i<= 8; i++){
				otp.append((int) (Math.random()*10));
			}
			return otp.toString();
		};
		System.out.println(sup.get());
	}
}