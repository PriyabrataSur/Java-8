import java.time.LocalDateTime;
import java.time.LocalDate;

public class DateExample {
    
    public static void main(String[] args) {
        LocalDateTime d1 = LocalDateTime.now();
        System.out.println(d1);

        LocalDate d2 = LocalDate.now();
        System.out.println(d2);
    
        LocalDate d3 = LocalDate.of(2024,02, 01);
        System.out.println(d3);

         d2 = d2.plusDays(4);
        System.out.println(d2);

        d2 = d2.plusMonths(11);
        System.out.println(d2);
    }
}
