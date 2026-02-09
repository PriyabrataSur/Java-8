import java.util.function.BiConsumer;
public class BiConsumerDemo{
    public static void main(String[] args) {
        BiConsumer<String, String> cons = (d1, d2) -> System.out.println(d1+d2);
        cons.accept("Priyabrata ", "Sur");
    }
} 