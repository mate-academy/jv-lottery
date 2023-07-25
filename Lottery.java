import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;

    public static Ball getRandomBall() {
        String color = ColorSupplier.getRandomColor();
        int number = new Random().nextInt(MAX_NUMBER) + 1;
        return new Ball(color, number);
    }

    public static void main(String[] args) {
        Ball ball1 = getRandomBall();
        Ball ball2 = getRandomBall();
        Ball ball3 = getRandomBall();

        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);
    }
}
