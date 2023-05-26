package core.basesyntax;

public class Application {
    private static final int BALLS_AMOUNT = 3;

    public static void main(String[] args) {
        Lottery game = new Lottery();
        for (int i = 0; i < BALLS_AMOUNT; i++) {
            System.out.println(game.getRandomBall().toString());
        }
    }
}
