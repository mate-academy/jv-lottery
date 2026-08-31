package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 3) {
            Ball randomBall = new Lottery().getRandomBall();
            System.out.println(randomBall);

            counter++;
        }
    }
}
