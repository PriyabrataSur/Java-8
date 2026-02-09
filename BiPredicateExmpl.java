import java.util.function.BiPredicate;
public class BiPredicateExmpl{
    public static void main(String[] args) {
        
        BiPredicate<String, Integer> filter = (x,y) -> {return x.length() == y; };

        boolean res = filter.test("Parker", 6);
	System.out.println(res);
    }
}