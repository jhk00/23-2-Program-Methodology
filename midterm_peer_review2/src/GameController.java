public class GameController {

    private Player player;
    private Computer computer;
    private Registrar registrar;

    public GameController(Player p, Computer c, Registrar r) {
        player = p;
        computer = c;
        registrar = r;
    }

    // 플레이어 턴 진행
    public void playerTurn() {

        System.out.println("* 당신의 공격!");
        int com_gua = computer.pickForGuard();
        int pla_att = registrar.chooseForAttack(Math.min(player.getBeads(), computer.getBeads()));
        System.out.println("당신은 " + pla_att + "개의 구슬을 집었습니다.");
        boolean even = registrar.chooseEven();
        if (even) {
            System.out.println("당신은 짝을 선택했습니다.");
        }
        else {
            System.out.println("당신은 홀을 선택했습니다.");
        }
        System.out.println("컴퓨터가 손을 폅니다...");
        System.out.println(com_gua + "개의 구슬입니다!");

        if (even && com_gua % 2 == 0) {
            System.out.println("당신이 이겼습니다. 구슬 획득! : " + pla_att);
            player.addBeads(pla_att);
            computer.removeBeads(pla_att);
        }
        else if (!even && com_gua % 2 == 1) {
            System.out.println("당신이 이겼습니다. 구슬 획득! : " + pla_att);
            player.addBeads(pla_att);
            computer.removeBeads(pla_att);
        }
        else {
            System.out.println("당신이 졌습니다. 구슬 제출! : " + pla_att);
            player.removeBeads(pla_att);
            computer.addBeads(pla_att);
        }

        System.out.println("당신의 구슬 : " + player.getBeads());
        System.out.println("컴퓨터의 구슬 : " + computer.getBeads());
    }


    // 컴퓨터 턴 진행
    public void computerTurn() {

        System.out.println("* 컴퓨터의 공격!");
        int com_att = computer.pickForAttack();
        int pla_gua = registrar.chooseForGuard(Math.min(player.getBeads(), computer.getBeads()));
        System.out.println("당신은 " + pla_gua + "개의 구슬을 집었습니다.");
        System.out.println("컴퓨터가 " + com_att + "개의 구슬을 집어듭니다...");
        boolean even = computer.pickEven();
        if (even) {
            System.out.println("컴퓨터가 짝을 선택합니다.");
        }
        else {
            System.out.println("컴퓨터가 홀을 선택합니다.");
        }
        if (even && pla_gua % 2 == 0) {
            System.out.println("당신이 졌습니다. 구슬 제출! : " + com_att);
            player.removeBeads(com_att);
            computer.addBeads(com_att);
        }
        else if (!even && pla_gua % 2 == 1) {
            System.out.println("당신이 졌습니다. 구슬 제출! : " + com_att);
            player.removeBeads(com_att);
            computer.addBeads(com_att);
        }
        else {
            System.out.println("당신이 이겼습니다. 구슬 획득! : " + com_att);
            player.addBeads(com_att);
            computer.removeBeads(com_att);
        }

        System.out.println("당신의 구슬 : " + player.getBeads());
        System.out.println("컴퓨터의 구슬 : " + computer.getBeads());
    }

    // 턴 반복
    public void play() {
        System.out.println("* 게임을 시작합니다...");
        System.out.println("당신의 구슬 : " + player.getBeads());
        System.out.println("컴퓨터의 구슬 : " + computer.getBeads());
        while (true) {
            this.playerTurn();
            if (!player.lose() && !computer.lose()) {
                this.computerTurn();
            }
            else {
                break;
            }
        }
    }
}