package Calendar2;
import java.time.*;
public class Controller {
    public void control(Model m, ViewIn in, ViewOut out) {
    LocalDate d = in.getDate("목표");
    Period p = m.countdown(d);
    m.countdown(d);
    out.showCountdown(d,p);

    }
}
