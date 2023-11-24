package PuzzleGame;
import javax.swing.*;
import java.awt.*;
public class PuzzleWriter extends JPanel {
    SlidePuzzleBoard board; // 그릴 퍼즐보드를 담는다.

    private final int SIZE; // 퍼즐 보드의 크기를 의미하며, 초기값

    int empty_row; // 퍼즐보드에서 현재 비어있는 열(row)을 의미한다.

    int empty_col; // 퍼즐보드에서 현재 비어있는 행(col)을 의미한다.


   /* public PuzzleWriter(SlidePuzzleBoard b) {
        int SIZE = 200;
        JFrame frame = new JFrame();
        frame.getContentPane().add(this);
        frame.setTitle("Slide Puzzle");
        frame.setSize(SIZE, SIZE);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }*/
   public PuzzleWriter(SlidePuzzleBoard b) {
       board = b;
       SIZE = 30;
       JFrame f = new JFrame();
       f.getContentPane().add(this);
       f.setLocation(550,100);
       f.setTitle("Slide Puzzle");
       f.setSize(SIZE*6, SIZE*6+28);
       f.setVisible(true);
       f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
   }

    public void paintComponent(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillRect(0, 0, SIZE*6, SIZE*6);
        PuzzlePiece[][] r = board.contents();
        for (int i = 0; i < 4; i = i + 1) {
            for (int j = 0; j < 4; j = j + 1) {
                paintPiece(g, r[i][j], i, j);
            }
        }
    }


    private void paintPiece(Graphics g, PuzzlePiece p, int i, int j) {
        int x = SIZE + (SIZE * j);
        int y = SIZE + (SIZE * i);
        if (p != null) {
            g.setColor(Color.WHITE);
            g.fillRect(x, y, SIZE, SIZE);
            g.setColor(Color.BLACK);
            g.drawRect(x, y, SIZE, SIZE);
            int face_value = p.faceValue();
            if (face_value < 10)
                g.drawString(face_value + "", x+11, y+20);
            else
                g.drawString(face_value + "", x+7, y+20);
        } // 사각형에 정중앙에 배치하기 위해
        else {
            g.setColor(Color.BLACK);
            g.fillRect(x, y, SIZE, SIZE);
        }
    }


    public void displayPuzzleBoard() {
        this.repaint();
    }

    public void showNoMove(String s) {
        JOptionPane.showMessageDialog(null, "Error: " + s );
    }


}

