package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery l1 = new Lottery();
        System.out.println(l1.getRandomBall());

        Lottery l2 = new Lottery();
        System.out.println(l2.getRandomBall());

        Lottery l3 = new Lottery();
        System.out.println(l3.getRandomBall());

    }
}
