package core.basesyntax;

public class Application {
    public static void main(String[] args) {

        Lottery lottery = new Lottery();

        System.out.println("First random ball = " + lottery.getRandomBall());

        System.out.println("Second random ball = " + lottery.getRandomBall());

        System.out.println("Third random ball = " + lottery.getRandomBall());

    }
}
