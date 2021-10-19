package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            Ball currentBall = new Lottery().getRandomBall();
            System.out.println(currentBall.toString());
        }
    }
}
