import java.util.function.Predicate;
class Pen{
	String name ; 
	int price;

	Pen(String name , int price){
		this.name = name;
		this.price = price;
	}
}

public class PredicateJoin{
	static boolean myPenList(Pen pen , Predicate<Pen> predicate){
		return predicate.test(pen);
	}
	public static void main(String []args){
		Pen p1 = new Pen("Parker", 5000);

		Predicate<Pen> checkByPriceGrtr = p -> p.price>1000;
		Predicate<Pen> checkByPriceLsr = p -> p.price<100;

		Predicate<Pen> predicate = checkByPriceGrtr.or(checkByPriceLsr);

		boolean myPen = myPenList(p1,predicate);
		System.out.println(myPen);
		
	}
}