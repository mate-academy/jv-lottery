package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball randomBall = lottery.getRandomBall();
        System.out.println(randomBall);
    }
}
