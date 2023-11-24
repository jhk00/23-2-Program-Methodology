public class Computer {
    private int beads;

    public Computer() {
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

    // 컴퓨터 공격
    // 최소 1, 최대 5
    public int pickForAttack() {
        boolean processing = true;
        int a = 0;
        while (processing) {
            int num = (int)(Math.random() * 5) + 1;
            if (beads > num) {
                processing = false;
            }
            a = num;
        }
        return a;
    }

    // 컴퓨터 수비
    // 최소 0, 최대 5
    public int pickForGuard() {
        boolean processing = true;
        int a = 0;
        while (processing) {
            int num = (int)(Math.random() * 6);
            if (beads > num) {
                processing = false;
            }
            a = num;
        }
        return a;
    }

    // 컴퓨터 홀짝
    // 홀이면 false, 짝이면 true
    public boolean pickEven() {
        int key = (int)(Math.random() * 2);
        boolean even;
        if (key == 0) {
            even = true;
        }
        else {
            even = false;
        }
        return even;
    }
}