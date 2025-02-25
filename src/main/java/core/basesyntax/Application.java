package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery randomBall = new Lottery();
        System.out.println(randomBall.getRandomBall());
        System.out.println(randomBall.getRandomBall());
        System.out.println(randomBall.getRandomBall());
    }
}
