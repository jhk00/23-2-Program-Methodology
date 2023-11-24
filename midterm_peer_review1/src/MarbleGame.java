public class MarbleGame {
    public static void main(String[] args) {
        Player p = new Player(10);
        Computer c = new Computer(10);
        Registrar r = new Registrar();
        new GameController(p, c, r).play();
    }
}
