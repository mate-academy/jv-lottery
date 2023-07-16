package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball first = lottery.getRandomBall();
        Ball second = lottery.getRandomBall();
        Ball third = lottery.getRandomBall();
        System.out.println("First ball: " + first
                + "\nSecond ball: " + second
                + "\nThird ball: " + third);
    }
}
