package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        int iteraziya = 0;
        while (iteraziya < 3) {
            System.out.println(Lottery.getRandomBall().toString());
            iteraziya++;
        }
    }
}
