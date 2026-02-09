
import java.util.function.Function;

public class FunctionEx {
    public static void main(String[] args) {
        Function<String,Integer> lenStr = str -> str.length();
        System.out.println("Length is: "+lenStr.apply("I love India"));
    }
}
