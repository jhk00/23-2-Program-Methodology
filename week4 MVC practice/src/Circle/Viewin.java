package Circle;
import javax.swing.*;
public class Viewin {
    public int getNumber(String message) {
        String input = JOptionPane.showInputDialog(message);
        return Integer.parseInt(input);
    }
}
