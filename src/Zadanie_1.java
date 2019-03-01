import java.time.*;
import java.time.chrono.ChronoLocalDate;
import java.util.Scanner;

public class Zadanie_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj datr i godz. ");
//
//        int  year = scanner.nextInt();
//        int  mounth = scanner.nextInt();
//        int  day = scanner.nextInt();
//        int  hour = scanner.nextInt();
//        int  min = scanner.nextInt();

        ZoneId zz = ZoneId.of("Europe/Warsaw");
        LocalDateTime of = LocalDateTime.of(2018, 10, 27, 19, 0);
        ZonedDateTime aa = ZonedDateTime.of(2018, 10, 27, 19, 0, 0, 0, zz);
        ZonedDateTime aa12 = ZonedDateTime.of(of, zz);
        System.out.println(of);
        System.out.println(aa);
        System.out.println("Ile godzin będziesz pracował");


        //  LocalDateTime of1 = LocalDateTime.of(year, mounth, +day , 7, min);
        LocalDateTime of1 = of.plusHours(12);
        ZonedDateTime aa1 = aa.plusHours(12);
        //  Duration bet    = Duration.between(of1,of);
        System.out.println(of1);
        System.out.println(aa1);
        ZoneId bankok = ZoneId.of("Asia/Bangkok");
        ZonedDateTime bangladesz = aa1.withZoneSameInstant(bankok);

        System.out.println(bangladesz);

    }
}
