package core.basesyntax;

public class Application extends Lottery {
    public static void main(String[] args) {
        int countOfBalls = 4;
        for (int i = 1; i < countOfBalls; i++) {
            System.out.println("Ball" + i + ": " + getRandomBall());
        }
    }
}
