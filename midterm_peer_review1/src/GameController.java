public class GameController {

    private Player player;
    private Computer computer;
    private Registrar registrar;

    GameController(Player p, Computer c, Registrar r) {
        player = p;
        computer = c;
        registrar = r;

    }

    public void playerTurn() {
        int max = Math.min(player.getBeads(), computer.getBeads());

        String playerpick = "";

        System.out.println("*당신의 공격!");

        int playerbead = registrar.chooseForAttack(max);
        int computerbead = computer.pickForGuard();
        boolean playerwin = true;
        boolean playerpickis = registrar.chooseEven();

        System.out.println("당신은 " + playerbead + "개의 구슬을 집었습니다.");
        if (playerpickis == true) {
            playerpick = "짝";
        } else
            playerpick = "홀";

        System.out.println("당신은 " + playerpick + "을 선택했습니다.");
        System.out.println("컴퓨터가 손을 폅니다.");
        System.out.println(computerbead + "개의 구슬입니다!");

        if (computerbead == 2 || computerbead == 4 || computerbead == 0) {
            if (playerpickis == true) {
                player.addBeads(playerbead);
                computer.removeBeads(playerbead);
            } else {
                player.removeBeads(playerbead);
                computer.addBeads(playerbead);
                playerwin = false;
            }
        } else {
            if (playerpickis == true) {
                player.removeBeads(playerbead);
                computer.addBeads(playerbead);
                playerwin = false;
            } else {
                player.addBeads(playerbead);
                computer.removeBeads(playerbead);
            }
        }

        if (playerwin == true) {
            System.out.println("당신이 이겼습니다. 구슬 획득! : " + playerbead);
        } else {
            System.out.println("당신이 졌습니다. 구슬 제출! : " + playerbead);
        }

        System.out.println("당신의 구슬" + player.getBeads());
        System.out.println("컴퓨터의 구슬" + computer.getBeads());
        System.out.println("-----------------------------------");
    }

    public void computerTurn() {
        int max = Math.min(player.getBeads(), computer.getBeads());

        String computerpick = "";

        System.out.println("*컴퓨터의 공격!");

        int playerbead = registrar.chooseForGuard(max);
        int computerbead = computer.pickForAttack();
        boolean playerwin = true;
        boolean computerpickis = computer.pickEven();

        System.out.println("당신은 " + playerbead + "개의 구슬을 집었습니다.");
        if (computerpickis == true) {
            computerpick = "짝";
        } else
            computerpick = "홀";

        System.out.println("컴퓨터가 " + computerbead + "개의 구슬을 집어듭니다... ");
        System.out.println("컴퓨터는 " + computerpick + "을 선택합니다...");

        if (playerbead == 2 || playerbead == 4 || playerbead == 0) {
            if (computerpickis == false) {
                player.addBeads(computerbead);
                computer.removeBeads(computerbead);
            } else {
                player.removeBeads(computerbead);
                computer.addBeads(computerbead);
                playerwin = false;
            }
        } else {
            if (computerpickis == false) {
                player.removeBeads(computerbead);
                computer.addBeads(computerbead);
                playerwin = false;
            } else {
                player.addBeads(computerbead);
                computer.removeBeads(computerbead);
            }
        }

        if (playerwin == true) {
            System.out.println("당신이 이겼습니다. 구슬 획득! : " + computerbead);
        } else {
            System.out.println("당신이 졌습니다. 구슬 제출! : " + computerbead);
        }

        System.out.println("당신의 구슬" + player.getBeads());
        System.out.println("컴퓨터의 구슬" + computer.getBeads());
        System.out.println("-----------------------------------");

    }


    public void play() {

        System.out.println("당신의 구슬" + player.getBeads());
        System.out.println("컴퓨터의 구슬" + computer.getBeads());

        while(!player.lose()  && !computer.lose()) {
            System.out.println("*게임을 시작합니다...");

            playerTurn();
            if (player.lose()){
                System.out.println("아쉽습니다. 패배하였습니다.");
                System.exit(0);
            }
            else if (computer.lose()) {
                System.out.println("축하합니다. 승리하였습니다");
                System.exit(0);
            }
            computerTurn();
        }

        if (player.lose()){
            System.out.println("아쉽습니다. 패배하였습니다.");
            System.exit(0);
        }
        else if (computer.lose()) {
            System.out.println("축하합니다. 승리하였습니다");
            System.exit(0);
        }
    }
}



