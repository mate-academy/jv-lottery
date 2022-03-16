package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery one = new Lottery();
        Lottery two = new Lottery();
        Lottery three = new Lottery();

        System.out.println(one.getRandomBall());
        System.out.println(two.getRandomBall());
        System.out.println(three.getRandomBall());
    }
}
