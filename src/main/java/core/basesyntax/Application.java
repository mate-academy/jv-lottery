package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 1; i <= 3; i++) {
            Ball currentBall = lottery.getRandomBall();
            System.out.println(currentBall.toString());
        }
    }
}
