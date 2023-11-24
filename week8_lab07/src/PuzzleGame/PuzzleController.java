package PuzzleGame;
import javax.swing.*;
public class PuzzleController {
    SlidePuzzleBoard board;
    PuzzleWriter writer;

    PuzzleController(SlidePuzzleBoard b, PuzzleWriter w) {
        writer = w;
        board = b;
    }

    public void play() {
        while (true) {
            writer.displayPuzzleBoard();
            String message = JOptionPane.showInputDialog("퍼즐 조각 번호를 입력하세요.");
            boolean m =  board.move(Integer.parseInt(message));
            if(m == false)
                writer.showNoMove("움직일 수 없습니다!");
        }
    }
}
