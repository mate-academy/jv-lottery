package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Ball getRandomBall = Lottery.getRandomBall();
            System.out.println("Random ball: " + i + " " + getRandomBall);
        }
    }
}
