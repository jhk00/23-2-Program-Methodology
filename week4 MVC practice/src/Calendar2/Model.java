package Calendar2;
import javax.swing.*;
import java.time.*;
public class Model {
    public Period countdown(LocalDate d) {
        LocalDate today = LocalDate.now();
    return Period.between(today,d);
    }
}
