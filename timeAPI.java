import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.zip.DataFormatException;

public class timeAPI {
    public static void main(String[] args) {
        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDate d = LocalDate.now();
        System.out.println(d);

        System.out.println();

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String date = dt.format(f);
        System.out.println(date);
    }
}