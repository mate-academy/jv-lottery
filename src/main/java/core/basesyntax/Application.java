package core.basesyntax;

public class Application {
    public static final int NUMBER_OF_BALLS = 3;

    public static void main(String[] args) {
        for (int i = 0; i <= NUMBER_OF_BALLS; i++) {
            System.out.println(new Lottery().getRandomBall().toString());
        }
    }
}
