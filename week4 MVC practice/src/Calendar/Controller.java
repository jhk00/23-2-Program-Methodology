package Calendar;
import java.time.*;
public class Controller {
    public void control(Model m, ViewOut v) {
        Period p = m.countdownXmas();
    m.countdownXmas();
    v.showCountdownXmas(p);
        v.showSwingCountdownXmas(p);
    }
}
