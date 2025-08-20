package core.basesyntax;

public class Application {

    public static void main(String[] args) {
        Ball ball1 = new Ball();
        Ball ball2 = new Ball();
        Ball ball3 = new Ball();

        Ball[] balls = {ball1, ball2, ball3};

        for (Ball result: balls) {
            System.out.println(result);
        }
    }
}
