package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery firstBall = new Lottery();
        System.out.println(firstBall.getRandomBall());
        Lottery secondtBall = new Lottery();
        System.out.println(secondtBall.getRandomBall());
        Lottery thirdtBall = new Lottery();
        System.out.println(thirdtBall.getRandomBall());
    }
}
