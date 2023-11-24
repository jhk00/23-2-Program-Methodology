package SlidePuzzle;
import javax.swing.*;
public class PuzzleController {
    private SlidePuzzleBoard puzzle;
    private PuzzleWriter writer;

    public PuzzleController(SlidePuzzleBoard p, PuzzleWriter w) {
        puzzle = p;
        writer = w;
    }

    public void play() {
        while (true) {
            writer.displayPuzzleBoard();
            String input = JOptionPane.showInputDialog("움직일 번호?");
            int n = Integer.parseInt(input);
            if (! puzzle.move(n))
                writer.showNoMove("움직일 수 없습니다.");
        }
    }
}
