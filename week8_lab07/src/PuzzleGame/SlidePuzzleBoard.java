package PuzzleGame;

public class SlidePuzzleBoard {
    private PuzzlePiece[][] board;

    public int empty_row;
    public int empty_col;

    public PuzzlePiece[][] contents() { return board; }
    public SlidePuzzleBoard() {
        board = new PuzzlePiece[4][4]; // 초기화 꼭 해줘야함
        int number = 1;
        for(int i = 3; i >= 0; i--) {
            for (int j = 3; j >= 0; j--) {
                board[i][j] = new PuzzlePiece(number);
                number++;
            }
        }
        board[0][0] = null;
        empty_row = 0;
        empty_col = 0;
    }



    public boolean move(int w) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (found(w, i, j - 1)) return true;
                else if (found(w, i - 1, j - 1)) return true;
                else if (found(w, i + 1, j)) return true;
                else if (found(w, i, j + 1)) return true;
            }
        }
        return false;
    }
// 여기 메서드만 손보기

    public boolean found(int v, int row, int col) {
        if (row >= 0 && row < 4 && col >= 0 && col < 4) {
            return board[row][col].faceValue() == v;
        }
        return false;
    }

}
