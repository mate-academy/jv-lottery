package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery one = new Lottery();

        Lottery two = new Lottery();

        Lottery three = new Lottery();

        System.out.println("The one ball is " + one.getRandomBall());
        System.out.println("The two ball is " + two.getRandomBall());
        System.out.println("The tree ball is " + three.getRandomBall());
    }
}
