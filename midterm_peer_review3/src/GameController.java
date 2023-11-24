public class GameController {
    private Player player;
    private Computer computer;
    private Registrar registrar;

    public GameController(Player p, Computer c, Registrar r) {
        player = p;
        computer = c;
        registrar = r;
    }

    public void playerTurn() {
        System.out.println("* 당신의 공격!");
        int cg = computer.pickForGuard();
        int pa = registrar.chooseForAttack(Math.min(player.getBeads(), computer.getBeads()));
        System.out.println("당신은 " + pa + "개의 구슬을 집었습니다.");
        boolean pc = registrar.chooseEven();
        System.out.println("컴퓨터가 손을 폅니다... " + cg + "개의 구슬입니다!");
        if ((cg % 2 == 0 && pc) || (cg % 2 != 0 && !pc)) {
            System.out.println("당신이 이겼습니다. 구슬 획득! : " + pa);
            player.addBeads(pa);
            computer.removeBeads(pa);
        } else {
            System.out.println("당신이 졌습니다. 구슬 제출! : " + pa);
            player.removeBeads(pa);
            computer.addBeads(pa);
        }
        System.out.println("당신의 구슬 : " + player.getBeads());
        System.out.println("컴퓨터의 구슬 : " + computer.getBeads());
    }

    public void computerTurn() {
        System.out.println("* 컴퓨터의 공격!");
        int ca = computer.pickForAttack(player.getBeads(), computer.getBeads());
        int pg = registrar.chooseForGuard(player.getBeads());
        System.out.println("당신은 " + pg + "개의 구슬을 집었습니다.");
        System.out.println("컴퓨터가 " + ca + "개의 구슬을 집어듭니다.");
        boolean cc = computer.pickEven();
        if ((pg % 2 == 0 && cc) || (pg % 2 != 0 && !cc)) {
            System.out.println("당신이 졌습니다. 구슬 제출! : " + ca);
            player.removeBeads(ca);
            computer.addBeads(ca);
        } else {
            System.out.println("당신이 이겼습니다. 구슬 획득! : " + ca);
            player.addBeads(ca);
            computer.removeBeads(ca);
        }
        System.out.println("당신의 구슬 : " + player.getBeads());
        System.out.println("컴퓨터의 구슬 : " + computer.getBeads());
    }

    public void play() {
        while (player.lose() && computer.lose()) {
            playerTurn();
            if (!player.lose() || !computer.lose()) {
                break;
            }
            computerTurn();
        }
        if (player.lose()) {
            System.out.println("축하합니다! 당신이 승리했습니다!");
        } else {
            System.out.println("컴퓨터가 승리했습니다!");
        }
    }
}
