package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery first = new Lottery();
        Lottery second = new Lottery();
        Lottery third = new Lottery();
        System.out.println(first.getRandomBall());
        System.out.println(second.getRandomBall());
        System.out.println(third.getRandomBall());
    }
}
