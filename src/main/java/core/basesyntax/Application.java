package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < 3; i++) {
            Ball nextRandomBall = lottery.getRandomBall();
            System.out.println(nextRandomBall);
        }
    }
}
