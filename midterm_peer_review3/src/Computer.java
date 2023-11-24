public class Computer {
    private int beads;

    public void addBeads(int n) {
        beads = beads + n;
    }

    public void removeBeads(int n) {
        beads = beads - n;
    }

    public int getBeads() {
        return beads;
    }

    public boolean lose() {
        return (beads != 0);
    }

    public int pickForAttack(int pmax, int cmax) {
        int minBeads = Math.min(pmax, cmax);
        int maxPick =  Math.min(6, minBeads);
        return (int) (Math.random()*maxPick);
    }

    public int pickForGuard() {
        int maxPick = Math.min(5, getBeads());
        return (int) (Math.random() * maxPick) + 1;
    }

    public boolean pickEven() {
        boolean b = ((Math.random()*2) % 2 == 0);
        if (b) {
            System.out.println("컴퓨터가 홀을 선택합니다...");
        } else {
            System.out.println("컴퓨터가 짝을 선택합니다...");
        }
        return b;
    }

    public Computer() {
        beads = 10;
    }
}
