
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class DateTimeExmpl {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        LocalDate cuDate = LocalDate.of(2025, 10, 5);
        System.out.println(cuDate);

        LocalDate cuDate1 = LocalDate.of(2025, Month.MAY, 5);
        System.out.println(cuDate1);

        LocalDate cuDate2 = LocalDate.parse("2026-02-01");
        System.out.println(cuDate2);

        cuDate2 = cuDate2.plusDays(4);
        System.out.println(cuDate2);

        cuDate2 = cuDate2.plusMonths(4);
        System.out.println(cuDate2);
        
        boolean isBefore = LocalDate.parse("2026-02-06").isBefore(LocalDate.parse("2026-02-01"));
        System.out.println(isBefore);

        boolean isAfter = LocalDate.parse("2026-02-06").isAfter(LocalDate.parse("2026-02-11"));
        System.out.println(isAfter);

        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);

        LocalTime time1 = LocalTime.now();
        System.out.println(time1);

        time1 = LocalTime.of(8,10,15);
        System.out.println(time1);

        Duration d1 = Duration.between(LocalTime.parse("10:10"),LocalTime.parse("12:16"));
        System.out.println(d1);

        Period p = Period.ofDays(3);
        System.out.println(p.getDays());

        Period p1 = Period.ofMonths(3);
        System.err.println(p1.getDays());
    }
}
