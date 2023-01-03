package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery firstBall = new Lottery();
        Lottery secondBall = new Lottery();
        Lottery thirdBall = new Lottery();
        Lottery[] array = new Lottery[]{firstBall, secondBall, thirdBall};
        for (Lottery i: array) {
            System.out.println(i.getRandomBall().toString());
        }
    }
}
