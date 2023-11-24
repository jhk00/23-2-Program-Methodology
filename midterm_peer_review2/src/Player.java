public class Player {
    private int beads;

    public Player() {
        beads = 10;
    }

    public void addBeads(int n) {
        beads += n;
    }

    public void removeBeads(int n) {
        beads -= n;
    }

    public int getBeads() {
        return beads;
    }

    public boolean lose() {
        boolean lose = false;
        if (beads == 0) {
            lose = true;
        }
        return lose;
    }
}