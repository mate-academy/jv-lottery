package core.basesyntax;

public class Application {
    public static void main(String[] args) {

        Lottery lottery1 = new Lottery();
        System.out.println(lottery1.getRandomBall());

        Lottery lottery2 = new Lottery();
        System.out.println(lottery2.getRandomBall());

        Lottery lottery3 = new Lottery();
        System.out.println(lottery3.getRandomBall());

    }
}
