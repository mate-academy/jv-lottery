package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery firstBall = new Ball();
        System.out.println(firstBall.getRandomBall());

        Lottery secondBall = new Ball();
        System.out.println(secondBall.getRandomBall());

        Lottery thirdBall = new Ball();
        System.out.println(thirdBall.getRandomBall());
    }
}
