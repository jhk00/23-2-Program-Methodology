package Calendar2;
import java.time.*;
import javax.swing.*;
public class ViewIn {
    public LocalDate getDate(String message) {
   int year = Integer.parseInt(JOptionPane.showInputDialog(message + "년을 입력하세요"));
   int month = Integer.parseInt(JOptionPane.showInputDialog(message + "월을 입력하세요"));
   int day= Integer.parseInt(JOptionPane.showInputDialog(message + "일을 입력하세요"));
    return LocalDate.of(year,month,day);
    }
}
