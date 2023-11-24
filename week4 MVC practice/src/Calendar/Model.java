package Calendar;
import java.time.*;
public class Model {
    public Period countdownXmas() {
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        LocalDate xmas = LocalDate.of(year, 12, 25);
        return Period.between(today,xmas);
    }
}
