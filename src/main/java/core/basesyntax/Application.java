package core.basesyntax;

public class Application {
    public static final int GAME = 3;

    public static void main(String[] args) {
        Lottery game = new Lottery();
        for (int i = 0; i < GAME; i++) {
            System.out.println(game.getRandomBall().toString());
        }
    }
}
