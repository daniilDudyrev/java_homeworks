package homework6.homework6_1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.function.*;

public class App {
    public static void main(String[] args) {

        // Проверка високосного года
        Predicate<Integer> isLeapYear = (year) -> {
            if (year % 4 != 0) {
                return false;
            } else if (year % 100 != 0) {
                return true;
            } else return year % 400 == 0;
        };

        System.out.println(isLeapYear.test(2023));


        LocalDate date1 = LocalDate.of(2023, 1, 1);
        LocalDate date2 = LocalDate.of(2023, 6, 9);

        //Подсчет количества дней между датами
        BiFunction<LocalDate, LocalDate, Long> daysBetween = (d1, d2) -> ChronoUnit.DAYS.between(d1, d2);

        System.out.println(daysBetween.apply(date1, date2));


        //Подсчет количества полных недель между датами
        BiFunction<LocalDate, LocalDate, Long> weeksBetween = (d1, d2) -> ChronoUnit.WEEKS.between(d1, d2);

        System.out.println(weeksBetween.apply(date1, date2));

        //Подсчёт дня недели по полученной дате
        Function<LocalDate, DayOfWeek> dayOfWeek = (d) -> DayOfWeek.from(d);

        System.out.println(dayOfWeek.apply(date1));
    }
}
