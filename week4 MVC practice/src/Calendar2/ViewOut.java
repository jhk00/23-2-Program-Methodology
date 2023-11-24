package Calendar2;
import java.time.*;
import javax.swing.*;
public class ViewOut {
    public void showCountdown(LocalDate d, Period p) {
        String message = d.getYear() + "년 " + d.getMonthValue() + "월 " + d.getDayOfMonth() + "일까지 " + p.getYears() + "년 " + p.getMonths() + "달 " + p.getDays() + "일 남았습니다.";
        JOptionPane.showMessageDialog(null,message);
    }
}
// LocalDate 클래스는 getMonthValue, getYear, getDayofMonth 이고 Period 클래스는 getMonths, getYears, getDays 처럼 끝에 s가 붙음
// LocalDate.getMonth() 는 FEBURARY 같은 값 나오고 getMonthValue 해야 2월, 3월 나옴!