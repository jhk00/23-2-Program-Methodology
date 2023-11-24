import javax.swing.*;
public class Registrar {

    public boolean chooseEven() {
        String message = JOptionPane.showInputDialog("홀짝 여부?");
        String input = message.trim();
        while(!input.equals("짝") && !input.equals("홀")  ) {
            message = JOptionPane.showInputDialog("홀짝 여부?");
            input = message.trim();
        }
        return input.equals("짝");
    }
    public int chooseForAttack(int max) {
        String message = JOptionPane.showInputDialog("집을 구슬의 개수?");
       int beads = Integer.parseInt(message);
               while(beads < 1 || beads > max || beads > 5 ) {
                   message = JOptionPane.showInputDialog("집을 구슬의 개수?");
                   beads = Integer.parseInt(message);
               }
                return beads;
        }

    public int chooseForGuard(int max) {
        String message = JOptionPane.showInputDialog("집을 구슬의 개수?");
        int beads = Integer.parseInt(message);
        while(beads < 0 || beads > max || beads > 5) {
            message = JOptionPane.showInputDialog("집을 구슬의 개수?");
            beads = Integer.parseInt(message);
        }
        return beads;
    }
}
