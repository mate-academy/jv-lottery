package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            Lottery lottery = new Lottery();
            Ball randomBall = lottery.getRandomBall();
            System.out.println(randomBall);
        }
    }
}
