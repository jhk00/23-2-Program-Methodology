package Calendar;
import java.time.*;
import javax.swing.*;
public class ViewOut {
    public void showCountdownXmas(Period p) {
    System.out.println("크리스마스까지 " + p.getMonths() + "달 " + p.getDays() + "일 남았다.");
    }
    public void showSwingCountdownXmas(Period p) {
        String message = "크리스마스까지 " + p.getMonths() + "달 " + p.getDays() + "일 남았다.";
        JOptionPane.showMessageDialog(null, message);
    }
}
