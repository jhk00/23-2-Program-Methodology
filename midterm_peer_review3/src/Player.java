public class Player {
    private int beads;

    public void addBeads(int n) {
        beads = beads + n;
    }

    public void removeBeads(int n) {
        beads = beads - n;
    }

    public Player() {
        beads = 10;
    }

    public int getBeads() {
        return beads;
    }

    public boolean lose() {
        return (beads != 0);
    }
}
