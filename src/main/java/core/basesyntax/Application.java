package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery firstBall = new Lottery();
        Lottery secondBall = new Lottery();
        Lottery thirdBall = new Lottery();

        System.out.println(firstBall.getRandomBall());
        System.out.println(secondBall.getRandomBall());
        System.out.println(thirdBall.getRandomBall());
    }
}

